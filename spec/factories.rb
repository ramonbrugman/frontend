require 'factory_girl'

FactoryGirl.define do

  factory :user do
    name 'Test User'
    email 'user@test.com'
    password 'please'
    after_create { |user| FactoryGirl.create(:project, :users => [user]) }

    factory :github_user do
      # This user doesnt have a username or email set up in their profile
      email 'builds@circleci.com'
      password 'engine process vast trace'
      name 'Circle Dummy user'
    end

    factory :admin_user do
      admin true
    end
  end


  factory :project do
    vcs_url "https://github.com/circleci/circle-dummy-project"

    factory :unowned_project do
      vcs_url "https://github.com/circleci/circle-dummy-project2"
    end

    factory :project_with_weird_characters do
      vcs_url "https://github.com/._-_.-/-.__-.-/"
    end

    factory :project_with_specs do
      vcs_url "https://github.com/circleci/project_with_specs"
      setup "echo do setup"
      dependencies "echo do dependencies"
      compile "echo do compile"
      test "echo do test"
      # extra is a new field, but no-one put anythingi n compile so we're fine.
      extra "echo do extra"
      inferred false
    end

    factory :inferred_project do
      inferred true
    end
  end


  factory :action_log do

    factory :successful_log do
      name "ls -l"
      exit_code 0
      out []
    end

    factory :failing_log do
      name "not-a-real-program"
      exit_code 127
      out []
    end
  end

  factory :build do
    vcs_url "https://github.com/circleci/circle-dummy-project"
    vcs_revision "abcdef123456789"
    start_time Time.now - 10.minutes
    stop_time Time.now
    build_num 1
    after_create { |b| FactoryGirl.create(:user) } # always make a user, and therefore a project

    factory :successful_build do
      failed false
    end

    factory :failing_build do
      failed true
    end
  end


  factory :signup do
    email "test@email.com"
    contact "true"
  end
end
