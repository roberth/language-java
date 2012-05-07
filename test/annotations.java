package p;
class Item { }
class Carrot extends Item { }
class Book { }

// Same as: @Edible(value = true)
class X {
@Edible(true)
Item item = new Carrot();
}

@interface Edible {
  boolean value() default false;
}

class Y {
@Author(first = "Oompah", last = "Loompah")
@p.Booklike
Book book = new Book();
}
 
@interface Author {
  String first();
  String last();
}

@interface Booklike {
}