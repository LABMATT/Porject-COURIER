const { Socket } = require('socket.io');

const app = require('express')();
const http = require('http').Server(app);
const io = require('socket.io')(http);

this.activeUsers = [];

io.on('connection', (socket) => {
  socket.on('userinfo', (msg) => {
    this.activeUsers.push(new UserParm(socket.id, msg[0], msg[1]));
  });
});

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
