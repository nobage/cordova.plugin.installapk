# cordova-plugin-installapk (适用于ionic2/3)
## 插件制作原因：android API26及以上版本安装apk需要获取应用安装权限。
## 该插件有两个作用：一是检查当前应用是否具有应用安装权限，二是获取应用安装权限。

1. ionic2/3 安装插件

    ionic cordova plugin add cordova.plugin.installapk
2. 声明变量

    在使用之前声明：declare let InstallApk: any;
3. 检查应用安装权限

    InstallApk.checkInstallPermission(result => {console.log("true=有安装权限，false=无权限")}, error => undefined);
	
4. 打开申请安装权限界面

    InstallApk.switchToAppInstallSettings();
