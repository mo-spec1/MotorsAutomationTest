Feature: Customer can view a product detail
  As a Motors customer
  I want the ability to view the details of a product I select at random
  So that I can decide to buy

  Scenario Outline: Search for a car
   Given I navigate to the motors homepage
   When I Enter a <Postcode>
   And select a <Make> and <Model> between <Minimum> and <Maximum> price
   And I click on the search button
   Then I can select a <Product> from the search result
   And details of the selected product is displayed

  Examples:
  | Postcode | Make       | Model      | Minimum | Maximum  | Product              |
  | M1 1FT   | Audi       | A3         | £2,000  | £30,000  | Audi A3              |
  | RM15 6EU | Land Rover | Discovery  | £7,000  | £40,000  | Land Rover Discovery |
  | OL10 6YG | Bently     | Bentayga   | £88,000 | £219,000 | Bently Bentayga      |