object ClassExample{
    def main(args:Array[String]){
        class User{
            var name: String = _
            var orders: List[Order] = Nil
        }

        class Order{
            var id: Int = _
            var products: List[Product] = Nil
        }

        class Product(var id: Int, var category: String){
        }

        // testUser = User("Ren Jie")
        val testProduct = new Product(1, "Shampoo")
        println(testProduct)
        println(testProduct.id)
        println(testProduct.category)
    }
}