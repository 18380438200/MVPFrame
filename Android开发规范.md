# Android 开发规范

### 命名

1. 对于Java文件中所有类名,方法名和变量都按照驼峰命名法,对于Java类中的变量和函数都要按照public,protected,private的权限规范来.
2. 对于xml中的文件的name,id之类的命名只允许小写字母,数字和下划线'_',命名应该尽量精简,减少无必要的命名描述,命名View的id时应为"自定义+功能+类型",例如命名一个在注册页面的"确定"按钮,结果为"register_confirm_btn",对于类型的定义原则上取控件名每个单词的首字母,例如TextView为tv,EditText为et.
3. 对于drawable资源文件的命名,采用"页面(或位置)+类型+自定义+状态",例如命名一个注册页面自动登录的checkbox的资源命名应该是"register_cb_auto_login_normal"和"register_cb_auto_login_checked",或者可以再精简为"register_cb_normal"和"register_cb_checked".再比如,通用的Toolbar上面的一个返回图标,我们应该命名为"toolbar_icon_back".
4. 对于layout资源文件的命名,采用"类型+页面名(或部位名)",类型分为页面(activity),块(fragment),通用(include),视图(view),列表项(item).


>#### 目录(针对drawable资源图片)
res/drawable-hdpi
res/drawable-xhdpi
res/drawable-xxhdpi

>####命名规范
采用"页面(或位置)+类型+自定义+状态",采用以小写字母开头,包含小写字母+下划线(_)+数字的组合命名,要确保每个命名都是唯一的不重复的.
页面(或位置),主要为注册页(register),登录页(login),首页(home)以及其他页面,位置主要分顶部栏(topbar),底部栏(bottombar),中间内容区域(content)
类型,分类主要为按钮(Button)->btn,单选框(RadioButton)->rb,图片(ImageView)->iv,背景(Background)->bg,图标(Icon)->icon....(有不明确的再沟通)
自定义,描述这个图片的作用,或者含义的英文单词
状态,表示表示该控件在不同状态下的不同图.主要状态分普通(normal),按下(pressed),聚焦(focused),不可点(disabled),选中(checked),被选(selected).如果只有普通状态时,可以去掉命名中的"状态"部分.
color.xml的命名规范 颜色+下划线(_)+十六进制颜色码(字母大写) 例如 red_FF6699
>####案例
1. 命名一个注册页面自动登录的checkbox的资源命名应该是"register_cb_auto_login_normal.png"和"register_cb_auto_login_checked.png",或者可以再精简为"register_cb_normal.png"和"register_cb_checked.png".
2. 通用的顶部栏(topbar)上面的一个返回图标,我们应该命名为"topbar_icon_back.png".
3. 搜索框内的"X"图标,可能有两种不同风格实用在不同界面,这时候,我们再加上一个特征来做区分,假设一个是暗底色"X",一个是亮底色"X",那我们就命名为"search_icon_clean_dark.png"和"search_icon_light_clean.png".
4. 假设我们车辆列表里面排序控件中的小钩子"√"图标,表示了当前选中的排序方式,这时,我们需要一张包含"√"的图片和一张透明的图片来分别表示选中和未选中状态,命名分别为"item_icon_order_selected.png"和"item_icon_order_normal.png"


### [drawable资源使用](http://developer.android.com/intl/zh-cn/guide/topics/resources/drawable-resource.html)
1. 对于drawable中的的图片,使用优先级png>jpg>gif,对于矩形(rectangle),原型(oval),线(line)和环(ring)等资源一律使用[shape](http://developer.android.com/intl/zh-cn/guide/topics/resources/drawable-resource.html#Shape)实现来替代图片,

### [Java编程规范](http://source.android.com/source/code-style.html)
1. 原则上确保每个方法都有注释,说明方法功能,入参和返回结果.
2. 尽量精简每个方法的长度,降低耦合度,确保每个方法只干一件事.
3. 在方法中严禁出现数字,凡是要用到数字的地方全部作为静态变量整理到Constants.java中.
4. 严禁在方法中用try...catch来截获所有的异常,然后不做任何异常处理.我们应该针对不同异常抛出不同的错误给方法调用者.
5. Java类中所有的成员变量除了Public和static变量外,其他成员变量命名都用m开头.静态变量用s开头,静态常量用大写字母和"_"组合的方式吗,public变量用小写字母开头.
```java
    public class MyClass {
        public static final int SOME_CONSTANT = 42;
        public int publicField;
        private static MyClass sSingleton;
        int mPackagePrivate;
        private int mPrivate;
        protected int mProtected;
     }
```
6. 原则上所有的if...else if...else都要有{},如果是单个if语句,并且if下只有一个操作,可以允许合并成一行不加{}.
```java
    if (condition) {//推荐
        body();
    }
    if (condition) body();//可以接受
    if (condition)
        body();  // 严禁!
```
7. 如果标注了TODO的,一定要加上描述,说明这个TODO是要干什么.
8. 简称等同于单词,一样使用驼峰命名,而不是每个字母都大写,例如使用XmlHttpRequest,而不是XMLHTTPRequest.

### 布局文件编写注意点
在编写布局文件时，常常会为了预览布局加入一些在初始化时不会出现的属性，例如`android:text="111111111111"`，这些需要在完成后删除，但常常是会忘记删除造成界面在
未获取真实数据时显示这些无用数据。即使删除后也会造成再次编辑时的麻烦。 其实只要将命名空间换成`tools`即可，例如`tools:text="11111111111111“`，它会保证只在
预览时出现，正式编译也不会出现，也可以作用于任何属性，并且在同时存在时优先展示`tools`修饰的属性。


##网络请求
网络请求request必须继承BaseRequest，分页请求必须继承PagerRquest；原则是新接口不再增加继承BaseResponse的类，接口统一使用BaseResponse<Domin>接收

### git规范
1.遵守[gitflow](https://github.com/maihaoche/manual/blob/master/git.md)相关
2.合并代码是遇到错误一定要谨慎谨慎再谨慎,好好比对每一处冲突的地方,不能只顾自己代码提交上去了,却把别人代码废弃了