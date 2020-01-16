package com.windea.study.datastructure.stack;

//使用栈完成表达式的计算思路
//通过一个索引遍历我们的表达式
//如果发现是一个数字，则直接入数栈
//如果发现是一个符号：
//  如果当前符号栈为空，则直接入栈。
//  如果当前符号栈不为空，则比较优先级，
//  如果当前符号优先级较小或等于，则需要立即进行一次计算，
//  取出数栈中两个数和符号栈中一个符号进行计算，
//  将结果入数栈，然后将当前符号入符号栈。
//  如果当前符号优先级较大，则直接入栈。
//当表达式扫描完毕后，按顺序从数栈和符号栈中取值进行运算
//最后数栈只有一个数字，即为表达式的结果

//确保栈顶的符号较下面的符号优先级较高

public class CalculatorDemo {
}
