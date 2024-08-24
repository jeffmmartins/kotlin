fun main() {
    var numero = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0 .. numero.size-1){
        println(i)
    }
    print('\n')

    var n = Array(size = 10, {i->i})
    for (i in n) {
        print("${n[i]}")
    }

    var j = booleanArrayOf(true, false, false, true)
    for (i in j){
        println(i)
    }
    
}