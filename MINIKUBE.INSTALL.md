# Ubuntu

## Install KVM2

```
# apt-get install qemu-kvm bridge-utils libvirt-daemon-kvm libvirt-clients libvirt-daemon-system qemu-kvm

# curl -Lo /tmp/docker-machine-driver-kvm2 https://storage.googleapis.com/minikube/releases/latest/docker-machine-driver-kvm2 &&  chmod +x /tmp/docker-machine-driver-kvm2 &&  sudo mv /tmp/docker-machine-driver-kvm2 /usr/bin/
```

## Install Minikube

```
# curl -Lo minikube https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64   && chmod +x minikube
 
# install minikube /usr/local/bin
```

## Install kubectl

```
# curl -LO https://storage.googleapis.com/kubernetes-release/release/`curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt`/bin/linux/amd64/kubectl
# chmod +x ./kubectl
# sudo mv ./kubectl /usr/local/bin/kubectl

```

## Launch Minikube

```
$ minikube start --memory=4096 --vm-driver=kvm2
```
