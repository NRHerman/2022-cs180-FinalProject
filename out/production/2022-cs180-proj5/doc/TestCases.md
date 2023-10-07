# Behaviors
* No server spawned
    * Failed to connect message
* Input email that does not exist
    * Prompted to register
* Input existing email with incorrect credentials
    * Warned of invalid credentials
* Input correct credentials
    * Continue
* View Market and View item
    * User can select an item with an index
* Sort marketplace
    * User can sort marketplace by price or quantity
* Add to cart
    * User can add an item to cart
* Buy all from cart
    * User can buy all items from cart

# Example flow
0. User `bobby` not in accounts.txt (not registered)
1. `bobby` tries to login
2. Prompted that account does not exist
3. Prompt for username, password, and whether they want to be a customer or seller
4. Register `bobby`'s credentials in our files
5. Show `bobby` the marketplace
