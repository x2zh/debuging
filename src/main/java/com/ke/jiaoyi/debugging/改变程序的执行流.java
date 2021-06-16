package com.ke.jiaoyi.debugging;

import org.apache.logging.log4j.util.Strings;

/**
 * <div style="font-size: 30;background:#f9f9f9">
 * <div style="font-size: 45;">改变程序的执行流 🤛</div><br>
 * <ul>
 * <li>返回上一层栈帧</li>
 * </ul>
 */
@SuppressWarnings("ALL")
public class 改变程序的执行流 {


    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 45;">使用断点表达式修改变量值 🤛</div><br>
     * <ol>
     * <li>在你想要修改的程序状态的行上添加断点</li>
     * <li>打开断点的属性设置页面</li>
     * <li>取消suspend的勾选，勾选Evaluate and log，并在输入框输入表达式</li>
     * </ol>
     */
    public static class 使用断点表达式修改变量值 {

        private static boolean readyToExit = false;

        private void printHello() {
            System.out.println("Hello");
            //more code goes here
            readyToExit = true;
        }

        public static void main(String[] args) {
            使用断点表达式修改变量值 af = new 使用断点表达式修改变量值();
            af.printHello();
            if (!readyToExit) main(null); // line n1
        }
    }




    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 45;">丢弃当前栈帧 🤛</div><br>
     * <ul>
     * <li>点击 drop frame</li>
     * <li>控制流回到上一层栈帧</li>
     * <li>重新进入当前方法，上一次调用修改的全局变量并不会撤销</li>
     * </ul>
     */
    int 丢弃当前栈帧;









    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 45;">从当前方法强制返回 🤛</div><br>
     * <ul>
     * <li>选择当前方法的栈帧</li>
     * <li>右键选择force return</li>
     * <li>在弹出的对话框中输入返回值表达式，如果是void类型，则不需要填写</li>
     * </ul>
     */
    int 从当前方法强制返回;























    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 45;">从当前方法抛异常返回 🤛</div><br>
     * <ul>
     * <li>选择当前方法的栈帧</li>
     * <li>右键选择throw exception</li>
     * <li>在弹出的对话框中输入异常表达式</li>
     * </ul>
     */
    int 从当前方法抛异常返回;
















    /**
     * <div style="font-size: 30;background:#f9f9f9">
     * <div style="font-size: 45;">重新加载修改过的类 🤛</div><br>
     * <div style="font-size: 38">限制</div>
     * <ul>
     * <li>只能更改方法体，不能更改方法签名</li>
     * <li>不支持新增和删除方法</li>
     * <li>目前处在调用栈中的方法不受影响，只影响新的调用</li>
     * <li></li>
     * </ul>
     */
    int 类文件热更新;



    public static class 从当前方法强制返回或抛异常 {

        String getName() {
            return null;
        }

        void Greet() {
            if (Strings.isBlank(getName())) {
                System.out.println("你好， " + "陌生人!");
            } else {
                System.out.println("你好， " + getName() + "!");
            }

        }


        public static void main(String[] args) {
            从当前方法强制返回或抛异常 m = new 从当前方法强制返回或抛异常();
            m.Greet();
        }
    }
}
