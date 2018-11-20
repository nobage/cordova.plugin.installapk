var exec = require('cordova/exec');

exports.checkInstallPermission = function (success, error) {
    exec(success, error, 'InstallApk', 'checkInstallPermission', []);
};
exports.switchToAppInstallSettings = function () {
    exec(null, null, 'InstallApk', 'switchToAppInstallSettings', []);
};