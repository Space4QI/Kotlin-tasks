package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num = 0
    for(i in 5..57){
        if(i != 34 && i != 46 && i != 52)
            num += i
    }
    println(num)
}