class A
  def m1
    self.m2()
  end
  def m2
    puts "A-m2"
  end
end
module M
  def m3
    self.m4()
  end
end
class B < A
  def m2
    puts "B-m2"
  end
end
class C < A
  include M
  def m4
    puts "C-m4"
  end
end
class D < B
  include M
end
D.new.m3
