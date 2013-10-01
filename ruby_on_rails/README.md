Ruby On Rails
=============

Put the Gemfile here into your project once generated

Just the Commands
=================

Set up the rails app
-------------------- 

    bundle exec rails new helloworld
    cd helloworld
    bundle install
    bundle exec rails generate model hello text:string
    bundle exec rails generate controller hello index
    bundle exec rake db:migrate

install rspec
-------------

    echo -e "gem 'rspec-core'\n" >> Gemfile
    echo -e "group :development, :test do\n" >> Gemfile
    echo -e "\tgem 'rspec-rails', '~> 2.0'\n" >> Gemfile
    echo -e "end\n" >> Gemfile
    bundle exec rails generate rspec:install

make some tests
---------------

    spec/
	spec_helper.rb     # already generated there for you
	models/
		hello_world_spec.rb

make the db
-----------

    RAILS_ENV=test bundle exec rake db:setup
    RAILS_ENV=test bundle exec rake db:seed


run the tests
=============

All the tests
-------------

    bundle exec rspec

One test suite
--------------

    bundle exec rspec spec/some_grouping/hello_world_spec.rb

One single test case
--------------------

    bundle exec rspec spec/some_grouping/hello_world_spec.rb -e 'should return a string in the little method'


