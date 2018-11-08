var exec = require('cordova/exec');

exports.checkInstallPermission = function (success, error) {
    exec(success, error, 'InstallPermission', 'checkInstallPermission', []);
};
exports.switchToAppInstallSettings = function () {
    exec(null, null, 'InstallPermission', 'switchToAppInstallSettings', []);
};