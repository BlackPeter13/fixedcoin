# FixedCoin 🔒

![FixedCoin](https://img.shields.io/badge/version-1.0.0-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Supply](https://img.shields.io/badge/supply-10%2C000%20FXC-orange.svg)
![Status](https://img.shields.io/badge/status-FIXED-red.svg)

> **"Once mined at block 1, this repository will be archived. Everything is Fixed."**

## 🔐 The Fixed Concept

FixedCoin isn't just another cryptocurrency - it's a statement about immutability and scarcity. With only **10,000 FXC** total supply and a codebase that will be **permanently archived after block 1**, FixedCoin represents the ultimate digital scarcity experiment.

### Why "Fixed"?

- ✅ **Code is Fixed** - Repository archived after block 1, no future changes
- ✅ **Supply is Fixed** - Exactly 10,000 FXC, no more, no less
- ✅ **Economics are Fixed** - Predetermined halving schedule, no governance changes
- ✅ **Distribution is Fixed** - 2 years mining period, then transaction fees only

## 💎 Tokenomics

| Parameter | Value |
|-----------|-------|
| **Total Supply** | 10,000 FXC |
| **Premine** | 1,600 FXC (16% - for listings, burned if unused) |
| **Block Reward** | 1 FXC |
| **Halving Interval** | Every 4,200 blocks |
| **Last Reward Block** | 113,400 (~2 years) |
| **Mining Algorithm** | SHA-256 (Bitcoin compatible) |
| **Block Time** | 10 minutes |
| **Coinbase Maturity** | 100 blocks |
| **Transaction Confirmations** | 6 blocks |

### Supply Distribution

```
Block 0 - 4,199:    1 FXC per block    = 4,200 FXC
Block 4,200 - 8,399: 0.5 FXC per block  = 2,100 FXC
Block 8,400 - 12,599: 0.25 FXC per block = 1,050 FXC
... (continues halving)
Total Minable: 8,400 FXC
Premine: 1,600 FXC
TOTAL: 10,000 FXC
```

## 🌐 Network Information

| Network | Details |
|---------|---------|
| **RPC Port** | 24761 |
| **P2P Port** | 24762 |
| **Official Nodes** | node1.fixedcoin.org<br>node2.fixedcoin.org |
| **ZMQ Block** | tcp://127.0.0.1:28332 |
| **ZMQ TX** | tcp://127.0.0.1:28333 |

## 🚀 Quick Start

### Windows

1. Download `fixedcoin-1.0.0-win64.zip` from [releases](https://github.com/Fixed-Blockchain/fixedcoin/releases/tag/FIX)
2. Extract the archive
3. Run `fixedcoin-qt.exe`
4. Wait for blockchain synchronization

### Linux

```bash
# Download and extract
wget https://github.com/VOTRE_USERNAME/fixedcoin/releases/download/v1.0.0/fixedcoin-1.0.0-linux-x86_64.tar.gz
tar -xzf fixedcoin-1.0.0-linux-x86_64.tar.gz

# Run wallet GUI
./fixedcoin-qt

# Or run daemon
./fixedcoind -daemon
```

## 🖥️ Ubuntu Server 22.04 Node Setup

Complete guide to run a FixedCoin node on Ubuntu Server 22.04.

### Prerequisites

```bash
sudo apt-get update && sudo apt-get upgrade -y
```

### Step 1: Create Directory Structure

```bash
# Create main directory
sudo mkdir -p /var/fixedcoin

# Create subdirectories
sudo mkdir -p /var/fixedcoin/bin        # Binaries
sudo mkdir -p /var/fixedcoin/data       # Blockchain data
sudo mkdir -p /var/fixedcoin/downloads  # Temporary downloads

# Set permissions
sudo chown -R $USER:$USER /var/fixedcoin
```

### Step 2: Download FixedCoin

```bash
cd /var/fixedcoin/downloads

# Download daemon
wget "https://dl.walletbuilders.com/download?customer=YOUR_CUSTOMER_ID&filename=fixedcoin-daemon-linux.tar.gz" -O fixedcoin-daemon-linux.tar.gz

# Download tools
wget "https://dl.walletbuilders.com/download?customer=YOUR_CUSTOMER_ID&filename=fixedcoin-qt-linux.tar.gz" -O fixedcoin-qt-linux.tar.gz
```

### Step 3: Extract Files

```bash
tar -xzvf fixedcoin-daemon-linux.tar.gz
tar -xzvf fixedcoin-qt-linux.tar.gz
```

You should now have:
- `fixedcoind` (14M) - Daemon
- `fixedcoin-cli` (1.2M) - CLI tools
- `fixedcoin-tx` (2.8M) - Transaction tools
- `fixedcoin-qt` (40M) - GUI wallet

### Step 4: Install Binaries

```bash
# Move binaries
mv fixedcoind fixedcoin-cli fixedcoin-tx fixedcoin-qt /var/fixedcoin/bin/

# Add to PATH
echo 'export PATH="/var/fixedcoin/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc

# Verify installation
which fixedcoind

# Clean up archives
rm fixedcoin-daemon-linux.tar.gz fixedcoin-qt-linux.tar.gz
```

### Step 5: Configure Node

Create configuration file:

```bash
nano /var/fixedcoin/data/fixedcoin.conf
```

Paste this configuration:

```ini
# RPC Settings
rpcuser=your_username
rpcpassword=your_strong_password
rpcbind=127.0.0.1
rpcallowip=127.0.0.1
rpcport=24761

# Network Settings
listen=1
server=1
port=24762
maxconnections=125

# Official Nodes
addnode=node1.fixedcoin.org
addnode=node2.fixedcoin.org

# Blockchain Settings
txindex=1
daemon=1

# ZMQ Notifications
zmqpubrawblock=tcp://127.0.0.1:28332
zmqpubrawtx=tcp://127.0.0.1:28333
zmqpubhashtx=tcp://127.0.0.1:28334
zmqpubhashblock=tcp://127.0.0.1:28335

# Wallet Configuration
wallet=miningcore

# Mining (optional - only if you want to mine)
gen=1
genproclimit=1
mineraddress=YOUR_FIXEDCOIN_ADDRESS
```

Save with `Ctrl + X`, then `Y`, then `Enter`

### Step 6: Create Wallet

```bash
# Start daemon manually first
fixedcoind -datadir=/var/fixedcoin/data

# Wait a few seconds, then create wallet
fixedcoin-cli -datadir=/var/fixedcoin/data createwallet "miningcore"

# Generate receiving address
fixedcoin-cli -datadir=/var/fixedcoin/data getnewaddress

# Save this address! Add it to fixedcoin.conf as mineraddress
```

### Step 7: Setup Systemd Service

Create service file:

```bash
sudo nano /etc/systemd/system/fixedcoind.service
```

Paste this configuration:

```ini
[Unit]
Description=FixedCoin Daemon
After=network.target

[Service]
Type=forking
User=root
Group=root
ExecStart=/var/fixedcoin/bin/fixedcoind -datadir=/var/fixedcoin/data -daemon
ExecStop=/var/fixedcoin/bin/fixedcoin-cli -datadir=/var/fixedcoin/data stop
Restart=on-failure
RestartSec=10
PIDFile=/var/fixedcoin/data/fixedcoind.pid

# Security limits
LimitNOFILE=8192
TimeoutStopSec=60

[Install]
WantedBy=multi-user.target
```

Save with `Ctrl + X`, then `Y`, then `Enter`

### Step 8: Enable and Start Service

```bash
# Reload systemd
sudo systemctl daemon-reload

# Stop manual daemon
fixedcoin-cli -datadir=/var/fixedcoin/data stop
sleep 5

# Enable service on boot
sudo systemctl enable fixedcoind

# Start service
sudo systemctl start fixedcoind

# Check status
sudo systemctl status fixedcoind
```

### Service Management Commands

```bash
# View live logs
sudo journalctl -u fixedcoind -f

# Restart service
sudo systemctl restart fixedcoind

# Stop service
sudo systemctl stop fixedcoind

# Check status
sudo systemctl status fixedcoind
```

## 🔧 Useful Commands

### Blockchain Information

```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getblockchaininfo
fixedcoin-cli -datadir=/var/fixedcoin/data getnetworkinfo
fixedcoin-cli -datadir=/var/fixedcoin/data getconnectioncount
fixedcoin-cli -datadir=/var/fixedcoin/data getpeerinfo
```

### Wallet Operations

```bash
# Get balance
fixedcoin-cli -datadir=/var/fixedcoin/data getbalance

# List wallets
fixedcoin-cli -datadir=/var/fixedcoin/data listwallets

# Get new address
fixedcoin-cli -datadir=/var/fixedcoin/data getnewaddress

# Send coins
fixedcoin-cli -datadir=/var/fixedcoin/data sendtoaddress "address" amount

# List transactions
fixedcoin-cli -datadir=/var/fixedcoin/data listtransactions
```

### Mining

```bash
# Check mining status
fixedcoin-cli -datadir=/var/fixedcoin/data getmininginfo

# Generate blocks (solo mining)
fixedcoin-cli -datadir=/var/fixedcoin/data generatetoaddress 1 "your_address"
```

## ⛏️ Mining FixedCoin

FixedCoin uses **SHA-256** algorithm, making it compatible with Bitcoin mining hardware.

### Solo Mining

Add to `fixedcoin.conf`:
```ini
gen=1
genproclimit=1
mineraddress=YOUR_ADDRESS
```

Then restart the daemon.

### Pool Mining

Use any SHA-256 compatible mining software:
- CGMiner
- BFGMiner
- NiceHash

Configure with your pool's stratum details.

## 🔐 Security Best Practices

- ✅ **Backup your wallet.dat** regularly
- ✅ **Encrypt your wallet** with a strong passphrase
- ✅ **Keep private keys offline** in cold storage
- ✅ **Use strong RPC passwords**
- ✅ **Enable firewall** on your server
- ✅ **Regular system updates**

## 📊 Block Explorer

Coming soon: https://explorer.fixedcoin.org

## 🗺️ Roadmap

| Phase | Status | Description |
|-------|--------|-------------|
| **Block 0** | ✅ Complete | Genesis block created |
| **Block 1** | ✅ Complete | First mine - Repository archived |
| **Year 1-2** | 🔄 Active | Mining distribution (10,000 FXC) |
| **Block 113,400** | 📅 Pending | Last block with mining reward |
| **Post-Distribution** | 📅 Future | Network secured by transaction fees only |

## 📄 Technical Specifications

```
Algorithm:           SHA-256 (Proof of Work)
Block Time:          10 minutes
Difficulty Retarget: Every 3 blocks (30 minutes)
Timestamp:           Fixed from start to finish
Address Prefix:      fix1 (Bech32)
Max Block Size:      1 MB
```

## 🤝 Community & Support

- **Website**: https://fixedcoin.org (coming soon)
- **Explorer**: https://explorer.fixedcoin.org (coming soon)
- **Discord**: https://discord.gg/fixedcoin (coming soon)
- **Twitter**: https://twitter.com/fixedcoin (coming soon)
- **GitHub**: https://github.com/VOTRE_USERNAME/fixedcoin

## ⚠️ Important Notice

FixedCoin is an experimental cryptocurrency project focused on absolute scarcity and immutability. The ultra-limited supply (10,000 FXC) and unique economic model based on transaction fees post-distribution create unprecedented dynamics.

**This is not financial advice. Do Your Own Research (DYOR).**

Key risks:
- Experimental tokenomics model
- No central development after block 1
- Network security depends on transaction fees post-distribution
- Extremely low supply may lead to high volatility

## 📜 License

FixedCoin is released under the MIT License. See [LICENSE](LICENSE) for details.

## 🔒 The Fixed Promise

Once block 1 is mined:
- ✅ Repository will be **archived**
- ✅ No code changes will ever be made
- ✅ No governance or voting mechanisms
- ✅ No ICO, no venture capital, no foundation
- ✅ Pure, immutable, fixed

**Everything is Fixed. Forever.**

---

**Join the Fixed Revolution** 🚀

*For integrity verification, always check the SHA256 hash of downloaded files against official releases.*
