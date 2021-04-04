// Gets socket io running.
const { Socket } = require('socket.io');

// Sets up an express server for for socket io to communicate on.
const app = require('express')();
const http = require('http').Server(app);
const io = require('socket.io')(http);

// List of active users.
this.activeUsers = [];

// When a new conenctions with pratmer userifo is established get the users info to create a new active user.
io.on('connection', (socket) => {
  socket.on('userinfo', (msg) => {
    this.activeUsers.push(new UserParm(socket.id, msg[0], msg[1]));
  });
});

// 
io.on('connection', (socket) => {
  socket.on('omsg', (msg) => {
    this.activeUsers.forEach()
    {
      
    }
  });
});

function getUser(sockitID)
{
activeUsers.
}

http.listen(8080, () => {
  console.log('listening on *:3000');
});

class UserParm {
  constructor(socketID, usrID, name)
  {
    this.usrID = usrID;
    this.socketID = socketID;
    this.name = name;

    console.log("values for obj: " + socketID + " " + name + " " + usrID);
  }

}
