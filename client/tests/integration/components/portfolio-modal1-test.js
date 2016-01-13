import { moduleForComponent, test } from 'ember-qunit';
import hbs from 'htmlbars-inline-precompile';

moduleForComponent('portfolio-modal1', 'Integration | Component | portfolio modal1', {
  integration: true
});

test('it renders', function(assert) {
  
  // Set any properties with this.set('myProperty', 'value');
  // Handle any actions with this.on('myAction', function(val) { ... });" + EOL + EOL +

  this.render(hbs`{{portfolio-modal1}}`);

  assert.equal(this.$().text().trim(), '');

  // Template block usage:" + EOL +
  this.render(hbs`
    {{#portfolio-modal1}}
      template block text
    {{/portfolio-modal1}}
  `);

  assert.equal(this.$().text().trim(), 'template block text');
});
