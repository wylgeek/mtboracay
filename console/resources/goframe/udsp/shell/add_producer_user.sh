#!/bin/bash

HOST_IP=$1
HOST_USERNAME=$2
HOST_PASSWORD=$3
FTP_USERNAME=$4
FTP_PASSWORD=$5
echo "HOST_IP="$HOST_IP
echo "HOST_USERNAME="$HOST_USERNAME
echo "HOST_PASSWORD="$HOST_PASSWORD
echo "FTP_USERNAME="$FTP_USERNAME
echo "FTP_PASSWORD="$FTP_PASSWORD

USERHOME=/home/user

expect -c "
spawn ssh ${HOST_USERNAME}@${HOST_IP}
expect {
\"*yes/no\" { send \"yes\r\"; exp_continue }
\"*password:\" { send \"${HOST_PASSWORD}\r\" }
}
expect \"#*\"
send \"if egrep '^${FTP_USERNAME}' /etc/passwd >& /dev/null; then echo 'user ${FTP_USERNAME} already exists!'; else useradd -d ${USERHOME}/${FTP_USERNAME} -m ${FTP_USERNAME} -p `openssl passwd -crypt ${FTP_PASSWORD}`; usermod -a -G CONSUMER ${FTP_USERNAME}; fi\r\"
send \"exit\r\"
expect eof"

exit 0