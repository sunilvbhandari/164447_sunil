import * as tslib_1 from "tslib";
import { Component } from '@angular/core';
var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'Hello World of TypeScript! ';
        this.firstname = "sunil";
        this.lastname = "vb";
        this.location = {
            "street": "2nd main byrappa layout",
            "city": "whitefield"
        };
    }
    AppComponent = tslib_1.__decorate([
        Component({
            selector: 'app-root',
            templateUrl: './app.component.html',
            styleUrls: ['./app.component.css']
        })
    ], AppComponent);
    return AppComponent;
}());
export { AppComponent };
var Address = /** @class */ (function () {
    function Address() {
    }
    return Address;
}());
//# sourceMappingURL=app.component.js.map