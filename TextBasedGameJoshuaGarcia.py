def GameInstructions():
    print("Welcome to the Desert Wasteland")
    print("A radioactive scorpion just invaded the town! To defeat the radioactive scorpion, collect items from all areas in the town!")
    input('Enter any key to continue: \n')

print("hello there!")
print(GameInstructions())

rooms_of_game = {
    'Main Street': {'North': 'Train Station', 'South': 'Old Saloon', 'West': 'Dry Riverbed', 'East': 'Small Farm'},
    'Train Station': {'South': 'Main Street', 'East': 'Canyon', 'Item': 'Repair Kit'},
    'Old Saloon': {'North': 'Main Street', 'East': 'Old Spanish Fort', 'Item': 'Mini Nuke Launcher'},
    'Dry Riverbed': {'East': 'Main Street', 'Item': 'Rad Away'},
    'Old Spanish Fort': {'West': 'Old Saloon', 'Item': 'Gold Bars'},
    'Small Farm': {'West': 'Main Street', 'North': 'Water Pump', 'Item': 'Purified Water'},
    'Canyon': {'West': 'Train Station', 'Item': 'T51b Power Armor'},
    'Water Pump': {'South': 'Small Farm', 'Boss': 'Radioactive Scorpion'}
}
last_player_move = ''
player_items = []
location = 'Main Street'

while True:
    print('You are in the {} location. You have items {}.'.format(location, player_items))
    print(last_player_move)

    if 'Item' in rooms_of_game[location].keys():
        item_in_room = rooms_of_game[location]['Item']

    if item_in_room not in player_items:
        print('You see a {}!'.format(item_in_room))

    if 'Boss' in rooms_of_game[location].keys():
        if len(player_items) < 6:
            print('You just got eaten by the radioactive scorpion! Who will save the town now?!')
            break

        if len(player_items) == 6:
            print('The radioactive scorpion is dead! You saved the town!')
            break
    user_input = input('What shall you do? You can Go North, South, East, or West. Go collect items too! Write Go Exit to quit: \n')

    user_move = user_input.split(' ')

    action = user_move[0].title()
    direction = user_move[1].title()

    if action == 'Go':
        if location in rooms_of_game and direction in rooms_of_game[location]:
            location = rooms_of_game[location][direction]
            print('You traveled {}!'.format(direction))
        else:
            print('STOP RUNNING AWAY AND DEFEND THE TOWN')
    if action == 'Go' and direction == 'Exit':
        print('You have quit the game! Thanks for playing!')
        break

    if action == 'Collect':
        if location in rooms_of_game and 'Item' in rooms_of_game[location]:
            item_in_room = rooms_of_game[location]['Item']

            if item_in_room in player_items:
                print('You already have {}!'.format(item_in_room))



            else:
                player_items.append(rooms_of_game[location]['Item'])
                 print('You collected, {}!'.format(item_in_room))
        else:
            print('cannot find this item')















