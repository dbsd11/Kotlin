package funcparam

import dataclass.User

/**
 * Created by bdiao on 16/11/18.
 */
fun definedFunc(a:String?,b:Int?,c:User){
    println(a?.length.toString()+b?.times(1)+c?.name)
}

fun main(args:Array<String>){
    definedFunc(null,null, User("asdsad",1))
}