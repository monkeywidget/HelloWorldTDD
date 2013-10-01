require 'spec_helper'

describe Hello do

  describe "#create" do
    it "with a text" do
      hello = Hello.create!(text: "Hello, World!")
      expect(hello.hello).to eq("Hello, World!")
    end
  end


end
