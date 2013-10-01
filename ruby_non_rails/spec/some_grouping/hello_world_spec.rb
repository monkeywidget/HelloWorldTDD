require 'spec_helper'
require 'hello_world'

describe HelloWorld do

  it "should return a string in the little method" do
    expect(HelloWorld.new.hello).to eq("Hello, World!")
  end



end

