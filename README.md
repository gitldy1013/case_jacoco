# case_jacoco

## 1.介绍
jacoco用于检测单元测试对应的代码覆盖率.本工程是样例工程，可查看pom.xml配置.

## 2.如何运行

### 1.引入jacoco相关依赖 通过jar的方式使用jacoco依赖于maven的生命周期 然后执行命令

```
mvn install
```

### 2.可调pom中的参数含义如下：
>* jacoco.method.percent #方法覆盖率百分比
>* jacoco.instruction.percent #指令覆盖率百分比
>* jacoco.line.percent #代码行覆盖率百分比
>* jacoco.class.missCount #允许未检测的类个数

### 3.如果打包过程中单元测试覆盖率低于阀值，install会失败。
可以动态修改阀值：
```
mvn install -Djacoco.method.percent=0.70 
```
运行成功后运行 **target\site\jacoco\index.html**

jacoco官网： [进入官网](http://www.eclemma.org/jacoco/trunk/index.html)
