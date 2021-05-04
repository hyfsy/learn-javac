package com.hyf.javac;

import com.hyf.bytecode.GenerateEntities;
import com.hyf.bytecode.GenerateEntity;

/**
 * 完整命令行命令：
 * javac src\test\java\com\hyf\javac\*.java -processor com.hyf.bytecode.CustomProcessor -classpath "E:\study\idea3\learn-javac\target\classes;" -encoding UTF-8
 * <p>
 * 正常编译方式：
 * javac
 * -classpath "E:\study\idea3\learn-javac\target\classes;" # 依赖的class路径，也可指定jar路径
 * -processor com.hyf.bytecode.CustomProcessor # 注解处理器
 * src\test\java\com\hyf\javac\*.java # 编译的源文件路径
 * -encoding UTF-8 # 防止提示乱码
 * <p>
 * 问题：
 * IDEA内编译会将编译路径用 "" 包括起来，导致无法使用通配符的形式选择编译路径
 * <p>
 * <p>
 * javac可选命令：
 * -g 生成所有调试信息
 * -sourcepath 编译依赖的源文件位置，classpath下找不到依赖，会通过此源文件路径编译后再查找
 * -parameters 编译生成变量名称
 *
 * @author baB_hyf
 * @date 2021/04/14
 */
@GenerateEntities({
        @GenerateEntity(value = "test_generate", packageName = "aaaa"),
        @GenerateEntity(value = "test_generate2", packageName = "com.hyf.aaa")
})
public class Hello {

    public static void main(String[] args) {
        System.out.println(1);
    }
}
