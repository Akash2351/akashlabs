import Ember from 'ember';

export default Ember.Component.extend({
    expose: function() {
        var app_controller = this.get('targetObject');
        var exposedName = "comp-" + this.get('id');
        app_controller.set(exposedName, this);
    }.on('init'),
    actions: {
        toggleModal: function () {
            this.toggleProperty('enabled');
        }
    }
});
