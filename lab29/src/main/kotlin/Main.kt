package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    println("Введите предложение")
    val text = readLine()
    if(text != null){
        val words = text.split("[^\\p{L}\\p{N}]+".toRegex())
        val count = words.size
        println(count)
    }
}
