(ns frontend.stefon)

(def hosted-scripts [{:path "js/hosted/intercom2.js"
                      :url "https://widget.intercom.io/widget/vnk4oztr"}])

(def asset-roots ["resources/assets"])

(def precompiles
  (concat ["js/om-dev.js.stefon"
           "js/om-production.js.stefon"
           "css/app.css"
           "img/docs/heroku-step1.png"
           "img/docs/heroku-step2.png"
           "img/logo.png"
           "img/outer/docs/artifacts_listing.png"
           "img/outer/docs/coverage_example.png"
           "img/outer/docs/ssh-build-button.png"
           "img/outer/docs/ssh-build-details.png"
           "img/outer/about/paul.png"
           "img/outer/about/allen.png"
           "img/outer/about/david.png"
           "img/outer/about/jenneviere.png"
           "img/outer/about/daniel.png"
           "img/outer/about/mahmood.png"
           "img/outer/about/gordon.png"
           "img/outer/about/danny.png"
           "img/outer/languages/build-screenshot-python.png"
           "img/docs/artifacts.png"
           "img/status-logos/success.svg"
           "img/status-logos/failure.svg"
           "img/status-logos/logo.svg"
           "img/outer/stories/john.jpg"
           "img/outer/stories/arthur.jpg"
           "docs/android.md"
           "docs/api.md"
           "docs/background-process.md"
           "docs/browser-debugging.md"
           "docs/browser-testing-with-sauce-labs.md"
           "docs/build-artifacts.md"
           "docs/bundler-latest.md"
           "docs/cabal-test-timeout.md"
           "docs/cant-follow.md"
           "docs/capybara-timeout.md"
           "docs/chromedriver-moving-elements.md"
           "docs/clojure-12.md"
           "docs/code-coverage.md"
           "docs/composer-api-rate-limit.md"
           "docs/config-sample.md"
           "docs/configuration.md"
           "docs/continuous-deployment-with-ninefold.md"
           "docs/continuous-deployment-with-heroku.md"
           "docs/continuous-deployment.md"
           "docs/deploy-google-app-engine.md"
           "docs/deploy-bluemix.md"
           "docs/docker.md"
           "docs/dont-run.md"
           "docs/ec2ip-and-security-group.md"
           "docs/environment-variables.md"
           "docs/environment.md"
           "docs/external-resources.md"
           "docs/file-ordering.md"
           "docs/filesystem.md"
           "docs/getting-started.md"
           "docs/git-bundle-install.md"
           "docs/git-npm-install.md"
           "docs/git-pip-install.md"
           "docs/github-3rdparty-app-restrictions.md"
           "docs/github-permissions.md"
           "docs/github-privacy.md"
           "docs/github-security-ssh-keys.md"
           "docs/how-parallelism-works.md"
           "docs/how-to.md"
           "docs/installing-custom-software.md"
           "docs/installing-elasticsearch.md"
           "docs/introduction-to-continuous-deployment.md"
           "docs/ios.md"
           "docs/language-haskell.md"
           "docs/language-java.md"
           "docs/language-nodejs.md"
           "docs/language-php.md"
           "docs/language-python.md"
           "docs/language-ruby-on-rails.md"
           "docs/languages.md"
           "docs/look-at-code.md"
           "docs/manually.md"
           "docs/missing-dir.md"
           "docs/missing-file.md"
           "docs/mobile.md"
           "docs/nightly-builds.md"
           "docs/oom.md"
           "docs/parallel-manual-setup.md"
           "docs/parallelism.md"
           "docs/parameterized-builds.md"
           "docs/permissions-and-access-during-deployment.md"
           "docs/php-memcached-compile-error.md"
           "docs/polling-project-status.md"
           "docs/privacy-security.md"
           "docs/pushing-packages-to-packagecloud.md"
           "docs/reference.md"
           "docs/requires-admin.md"
           "docs/rspec-wrong-exit-code.md"
           "docs/ruby-debugger-problems.md"
           "docs/ruby-exception-during-schema-load.md"
           "docs/skip-a-build.md"
           "docs/ssh-build.md"
           "docs/status-badges.md"
           "docs/test-metadata.md"
           "docs/test-with-solr.md"
           "docs/time-day.md"
           "docs/time-seconds.md"
           "docs/troubleshooting-browsers.md"
           "docs/troubleshooting-clojure.md"
           "docs/troubleshooting-haskell.md"
           "docs/troubleshooting-nodejs.md"
           "docs/troubleshooting-php.md"
           "docs/troubleshooting-python.md"
           "docs/troubleshooting-ruby.md"
           "docs/troubleshooting.md"
           "docs/unusual.md"
           "docs/what-happens.md"
           "docs/wrong-ruby-commands.md"
           "docs/wrong-ruby-version.md"
           "docs/manifest.json"]
          (map :path hosted-scripts)))
