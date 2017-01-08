package greeting

const testVersion = 3

func HelloWorld(str string) string {
   if str == "" { str = "World" }
   return "Hello, " + str + "!"
}
