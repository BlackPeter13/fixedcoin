# FixedCoin 🔒

![FixedCoin Logo](https://github.com/Fixed-Blockchain/fixedcoin/blob/main/fix.png)

![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)
![Supply](https://img.shields.io/badge/supply-10%2C000%20FXC-orange.svg)
![Algorithm](https://img.shields.io/badge/algorithm-SHA--256-blue.svg)
![Status](https://img.shields.io/badge/status-FIXED-red.svg)

**🌐 [Website](https://fixedcoin.org) | 🔍 [Explorer](https://explorer.fixedcoin.org) | 📦 [Releases](https://github.com/Fixed-Blockchain/fixedcoin/releases)**

> **"Once mined at block 1, this repository will be archived. Everything is Fixed."**

---

## 📚 Table of Contents

- [What is FixedCoin?](#-what-is-fixedcoin)
- [Why FixedCoin?](#-why-fixedcoin)
- [Technical Specifications](#-technical-specifications)
- [Network](#-network)
- [Downloads](#-downloads)
- [Quick Start Guide](#-quick-start-guide)
- [Ubuntu Server Setup](#️-ubuntu-server-2204-node-setup)
- [Node Management Commands](#-node-management-commands)
- [Mining FixedCoin](#️-mining-fixedcoin)
- [Supply Schedule](#-supply-schedule)
- [Security Best Practices](#-security-best-practices)
- [Troubleshooting](#-troubleshooting)
- [FAQ](#-frequently-asked-questions)
- [Additional Resources](#-additional-resources)
- [Disclaimer](#️-disclaimer)
- [License](#-license)

---

## 🔐 What is FixedCoin?

FixedCoin is an ultra-rare cryptocurrency with a total supply of only **10,000 FXC**. Built on Bitcoin's proven codebase and secured by SHA-256 mining, FixedCoin represents the ultimate experiment in digital scarcity and immutability.

**The Fixed Concept:**
- Repository will be **permanently archived** after block 1
- No future code changes or governance
- Pure, immutable, fixed forever

## 🎯 Why FixedCoin?

FixedCoin represents a radical experiment in cryptocurrency design:

- ✅ **No Governance Drama** - No debates, no forks, no community splits
- ✅ **No Protocol Upgrades** - What you see is what you get, forever
- ✅ **No Inflation Surprises** - 10,000 FXC. That's it. Forever.
- ✅ **No Foundation** - Pure community-driven from day one
- ✅ **No Uncertainty** - The protocol is completely predictable
- ✅ **Ultimate Scarcity** - 2,100x rarer than Bitcoin

**The only cryptocurrency that will never change.**

## 💎 Technical Specifications

| Parameter | Value |
|-----------|-------|
| **Total Supply** | 10,000 FXC |
| **Premine** | 1,600 FXC (16%) |
| **Block Reward** | 1 FXC (initial) |
| **Halving Interval** | 4,200 blocks |
| **Last Reward Block** | 113,400 |
| **Distribution Period** | ~2 years |
| **Mining Algorithm** | SHA-256 |
| **Block Time** | 10 minutes |
| **Difficulty Adjustment** | Every 3 blocks |
| **Coinbase Maturity** | 100 blocks |
| **Transaction Confirmations** | 6 blocks |
| **Address Format** | Bech32 (fix1...) |
| **RPC Port** | 24761 |
| **P2P Port** | 24762 |

## 🌐 Network

**Official Seed Nodes:**
- node1.fixedcoin.org:24762
- node2.fixedcoin.org:24762

**ZMQ Ports:**
- Raw Block: 28332
- Raw TX: 28333
- Hash TX: 28334
- Hash Block: 28335

**Block Explorer:**
- https://explorer.fixedcoin.org

## 📥 Downloads

### Latest Release: V Final

Download from [GitHub Releases](https://github.com/Fixed-Blockchain/fixedcoin/releases/tag/FIX)

#### Windows Binaries

**GUI Wallet (Recommended for Desktop)**
- [fixedcoin-qt-windows.zip](https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-qt-windows.zip) (21.4 MB)
- SHA256: `aee35420db0a2fb6496ac5b6c1eab933910bd3ecf61cdf737366a1c8e087e3ff`

**Daemon (For Servers)**
- [fixedcoin-daemon-windows.zip](https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-daemon-windows.zip) (6.46 MB)
- SHA256: `f5d52e17e4c0a5c861f31d984b97a9a4a77d21d5b2585dcb37d50c771a30b8a6`

#### Linux Binaries

**GUI Wallet (Recommended for Desktop)**
- [fixedcoin-qt-linux.tar.gz](https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-qt-linux.tar.gz) (21.3 MB)
- SHA256: `aee079bb693289a5a510d31b4367766cdffc6ae74965c93dd232534c1ec14a56`

**Daemon (For Servers)**
- [fixedcoin-daemon-linux.tar.gz](https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-daemon-linux.tar.gz) (6.37 MB)
- SHA256: `b9534576476ba008dcb2c71d2b254dfcf30a7e422c01a03339552df36d15593c`

#### Source Code

- [Source code (zip)](https://github.com/Fixed-Blockchain/fixedcoin/archive/refs/tags/FIX.zip)
- [Source code (tar.gz)](https://github.com/Fixed-Blockchain/fixedcoin/archive/refs/tags/FIX.tar.gz)

## 🚀 Quick Start Guide

### Windows Installation

1. Download [fixedcoin-qt-windows.zip](https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-qt-windows.zip)
2. Extract the archive to a folder (e.g., `C:\FixedCoin`)
3. Run `fixedcoin-qt.exe` to start the wallet
4. Wait for blockchain synchronization

### Linux Desktop Installation

```bash
# Download GUI wallet
wget https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-qt-linux.tar.gz

# Extract
tar -xzf fixedcoin-qt-linux.tar.gz

# Run GUI wallet
./fixedcoin-qt

# Or run daemon in background
./fixedcoind -daemon
```

## 🖥️ Ubuntu Server 22.04 Node Setup

Complete step-by-step guide to install and run a FixedCoin node on Ubuntu Server 22.04.

### Prerequisites

```bash
sudo apt-get update && sudo apt-get upgrade -y
```

### Step 1: Create Directory Structure

```bash
# Create main directory
sudo mkdir -p /var/fixedcoin

# Create subdirectories
sudo mkdir -p /var/fixedcoin/bin
sudo mkdir -p /var/fixedcoin/data
sudo mkdir -p /var/fixedcoin/downloads

# Set ownership
sudo chown -R $USER:$USER /var/fixedcoin
```

Verify:
```bash
ls -la /var/fixedcoin
```

Expected output:
```
drwxr-xr-x bin
drwxr-xr-x data
drwxr-xr-x downloads
```

### Step 2: Download FixedCoin Binaries

```bash
cd /var/fixedcoin/downloads

# Download daemon (6.37 MB)
wget https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-daemon-linux.tar.gz

# Download tools (CLI, TX utilities) (21.3 MB)
wget https://github.com/Fixed-Blockchain/fixedcoin/releases/download/FIX/fixedcoin-qt-linux.tar.gz
```

### Step 3: Extract Files

```bash
tar -xzvf fixedcoin-daemon-linux.tar.gz
tar -xzvf fixedcoin-qt-linux.tar.gz
```

Verify extraction:
```bash
ls -lh
```

You should see:
- `fixedcoind` (~14M) - Daemon
- `fixedcoin-cli` (~1.2M) - CLI tools
- `fixedcoin-tx` (~2.8M) - Transaction tools
- `fixedcoin-qt` (~40M) - GUI wallet

### Step 4: Install Binaries

```bash
# Move binaries to bin directory
mv fixedcoind fixedcoin-cli fixedcoin-tx fixedcoin-qt /var/fixedcoin/bin/

# Add to PATH
echo 'export PATH="/var/fixedcoin/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc

# Verify installation
which fixedcoind
```

Expected output: `/var/fixedcoin/bin/fixedcoind`

Clean up:
```bash
rm fixedcoin-daemon-linux.tar.gz fixedcoin-qt-linux.tar.gz
```

### Step 5: Configure Node

Create configuration file:

```bash
nano /var/fixedcoin/data/fixedcoin.conf
```

Paste the following configuration:

```ini
# RPC Settings
rpcuser=fixedcoin_rpc_user
rpcpassword=CHANGE_THIS_TO_SECURE_PASSWORD
rpcbind=127.0.0.1
rpcallowip=127.0.0.1
rpcport=24761

# Network Settings
listen=1
server=1
port=24762
maxconnections=125

# Official Seed Nodes
addnode=node1.fixedcoin.org
addnode=node2.fixedcoin.org

# Blockchain Settings
txindex=1
daemon=1

# ZMQ Notifications
zmqpubrawblock=tcp://127.0.0.1:24763
zmqpubrawtx=tcp://127.0.0.1:24764
zmqpubhashtx=tcp://127.0.0.1:24765
zmqpubhashblock=tcp://127.0.0.1:24766

# Wallet Configuration
wallet=miningcore
```

**Important:** Change `rpcuser` and `rpcpassword` to secure values. You can generate a secure password with:
```bash
openssl rand -hex 32
```

Save with `Ctrl + X`, then `Y`, then `Enter`.

Verify configuration:
```bash
cat /var/fixedcoin/data/fixedcoin.conf
```

### Step 6: Create Wallet

Start daemon manually for initial setup:

```bash
fixedcoind -datadir=/var/fixedcoin/data
```

Wait 5 seconds, then create wallet:

```bash
fixedcoin-cli -datadir=/var/fixedcoin/data createwallet "miningcore"
```

Expected output:
```json
{
  "name": "miningcore"
}
```

Generate receiving address:

```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getnewaddress
```

Example output: `fix1qjpunqltsnm2a4jpp87zh0646p7ta7hq0n8q4rk`

**Save this address securely!**

### Step 7: Setup Systemd Service

Stop the manual daemon:

```bash
fixedcoin-cli -datadir=/var/fixedcoin/data stop
```

Wait 5 seconds for clean shutdown.

Create systemd service file:

```bash
sudo nano /etc/systemd/system/fixedcoind.service
```

Paste the following:

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
LimitNOFILE=8192
TimeoutStopSec=60

[Install]
WantedBy=multi-user.target
```

Save with `Ctrl + X`, then `Y`, then `Enter`.

### Step 8: Enable and Start Service

```bash
# Reload systemd
sudo systemctl daemon-reload

# Enable service on boot
sudo systemctl enable fixedcoind

# Start service
sudo systemctl start fixedcoind

# Check status
sudo systemctl status fixedcoind
```

Expected status: `active (running)`

### Step 9: Verify Node Operation

Check blockchain info:
```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getblockchaininfo
```

Check network connections:
```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getconnectioncount
```

Check peer information:
```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getpeerinfo
```

Check if node is fully synced:
```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getblockchaininfo | grep -E "blocks|headers"
```

View live logs:
```bash
sudo journalctl -u fixedcoind -f
```

Press `Ctrl + C` to exit logs.

## 🔧 Node Management Commands

### Service Management

```bash
# Start service
sudo systemctl start fixedcoind

# Stop service
sudo systemctl stop fixedcoind

# Restart service
sudo systemctl restart fixedcoind

# Check status
sudo systemctl status fixedcoind

# View logs
sudo journalctl -u fixedcoind -f

# View last 100 lines of logs
sudo journalctl -u fixedcoind -n 100
```

### Blockchain Commands

```bash
# Get blockchain information
fixedcoin-cli -datadir=/var/fixedcoin/data getblockchaininfo

# Get network information
fixedcoin-cli -datadir=/var/fixedcoin/data getnetworkinfo

# Get peer information
fixedcoin-cli -datadir=/var/fixedcoin/data getpeerinfo

# Get connection count
fixedcoin-cli -datadir=/var/fixedcoin/data getconnectioncount

# Get current block count
fixedcoin-cli -datadir=/var/fixedcoin/data getblockcount
```

### Wallet Commands

```bash
# Get wallet balance
fixedcoin-cli -datadir=/var/fixedcoin/data getbalance

# List all wallets
fixedcoin-cli -datadir=/var/fixedcoin/data listwallets

# Get new receiving address
fixedcoin-cli -datadir=/var/fixedcoin/data getnewaddress

# List recent transactions
fixedcoin-cli -datadir=/var/fixedcoin/data listtransactions

# Send FXC (replace with actual values)
fixedcoin-cli -datadir=/var/fixedcoin/data sendtoaddress "fix1..." 1.0

# Get transaction details
fixedcoin-cli -datadir=/var/fixedcoin/data gettransaction "txid"
```

## ⛏️ Mining FixedCoin

FixedCoin uses **SHA-256** algorithm, making it compatible with Bitcoin ASIC miners.

### Solo Mining Configuration

Add to `/var/fixedcoin/data/fixedcoin.conf`:

```ini
# Mining Configuration
gen=1
genproclimit=1
mineraddress=YOUR_FIXEDCOIN_ADDRESS
```

Replace `YOUR_FIXEDCOIN_ADDRESS` with your actual address (e.g., `fix1q...`).

Restart daemon:
```bash
sudo systemctl restart fixedcoind
```

Check mining status:
```bash
fixedcoin-cli -datadir=/var/fixedcoin/data getmininginfo
```

### Pool Mining

Configure any SHA-256 compatible mining software (cgminer, bfgminer, etc.) to point to a FixedCoin mining pool when available.

## 📊 Supply Schedule

| Block Range | Reward per Block | Total FXC | Cumulative |
|-------------|------------------|-----------|------------|
| 0 - 4,199 | 1.0 FXC | 4,200 | 4,200 |
| 4,200 - 8,399 | 0.5 FXC | 2,100 | 6,300 |
| 8,400 - 12,599 | 0.25 FXC | 1,050 | 7,350 |
| 12,600 - 16,799 | 0.125 FXC | 525 | 7,875 |
| 16,800 - 20,999 | 0.0625 FXC | 262.5 | 8,137.5 |
| ... | (continues halving) | ... | ... |
| 113,400+ | 0 FXC | 0 | ~8,400 |
| **Premine** | - | 1,600 | - |
| **TOTAL** | - | **10,000 FXC** | - |

After block 113,400 (~2 years), no new coins are created. Network security is maintained through transaction fees.

## 🔐 Security Best Practices

### Wallet Security

- ✅ **Backup wallet regularly:** `wallet.dat` file is located in `/var/fixedcoin/data/`
- ✅ **Encrypt wallet:** Use `encryptwallet` command with strong passphrase
- ✅ **Secure private keys:** Never share your wallet.dat or private keys
- ✅ **Use strong RPC passwords:** Change default credentials in fixedcoin.conf

### Server Security

- ✅ **Firewall:** Configure UFW to allow only necessary ports
- ✅ **SSH security:** Use SSH keys, disable password authentication
- ✅ **Regular updates:** Keep Ubuntu and FixedCoin up to date
- ✅ **Monitoring:** Set up monitoring and alerting

### Firewall Configuration

```bash
# Enable UFW
sudo ufw enable

# Allow SSH
sudo ufw allow 22/tcp

# Allow FixedCoin P2P
sudo ufw allow 24762/tcp

# Check status
sudo ufw status
```

**Note:** RPC port 24761 should NOT be exposed to the internet. It's for local use only.

## 🐛 Troubleshooting

### Node won't start

```bash
# Check service status
sudo systemctl status fixedcoind

# View error logs
sudo journalctl -u fixedcoind -n 50

# Check debug.log
tail -f /var/fixedcoin/data/debug.log
```

### No connections to network

```bash
# Verify configuration
cat /var/fixedcoin/data/fixedcoin.conf

# Test node connectivity
ping node1.fixedcoin.org
ping node2.fixedcoin.org

# Manually add nodes
fixedcoin-cli -datadir=/var/fixedcoin/data addnode "node1.fixedcoin.org:24762" "add"
fixedcoin-cli -datadir=/var/fixedcoin/data addnode "node2.fixedcoin.org:24762" "add"
```

### Wallet issues

```bash
# List loaded wallets
fixedcoin-cli -datadir=/var/fixedcoin/data listwallets

# Load wallet manually
fixedcoin-cli -datadir=/var/fixedcoin/data loadwallet "miningcore"

# Get wallet info
fixedcoin-cli -datadir=/var/fixedcoin/data getwalletinfo
```

### Blockchain sync stuck

```bash
# Check current block
fixedcoin-cli -datadir=/var/fixedcoin/data getblockcount

# Check peer blocks
fixedcoin-cli -datadir=/var/fixedcoin/data getpeerinfo | grep -i "synced_blocks"

# Restart daemon
sudo systemctl restart fixedcoind
```

## ❓ Frequently Asked Questions

### What happens after all coins are mined?
After block 113,400 (~2 years), miners are compensated solely through transaction fees. This ensures long-term network security without inflation.

### Can the code be updated later?
No. The repository will be archived after block 1. No updates, no bug fixes, no changes. Ever. This is by design.

### Why only 10,000 coins?
To create the ultimate experiment in digital scarcity. FixedCoin is 2,100x rarer than Bitcoin, making it one of the scarcest cryptocurrencies ever created.

### Is this a joke/meme coin?
No. FixedCoin is a serious experiment in protocol immutability and extreme scarcity. It's built on Bitcoin's proven codebase with SHA-256 security.

### How can I contribute?
Build tools, wallets, services, and applications. The protocol is fixed, but the ecosystem is yours to create. Everything must be built by the community.

### What makes FixedCoin different from Bitcoin?
- **Ultra-rare supply:** 10,000 vs 21,000,000
- **Absolute immutability:** No updates after archive
- **Faster distribution:** ~2 years vs ~140 years
- **Community-driven:** No foundation or central authority

### Is it safe to use?
FixedCoin uses Bitcoin's proven codebase and SHA-256 algorithm. However, as with all cryptocurrencies, use at your own risk. See the [Disclaimer](#️-disclaimer) section.

## 📚 Additional Resources

- **Source Code:** [GitHub Repository](https://github.com/Fixed-Blockchain/fixedcoin)
- **Releases:** [Download Page](https://github.com/Fixed-Blockchain/fixedcoin/releases/tag/FIX)
- **Block Explorer:** [explorer.fixedcoin.org](https://explorer.fixedcoin.org)
- **Website:** [fixedcoin.org](https://fixedcoin.org)

## ⚠️ Disclaimer

FixedCoin is an experimental cryptocurrency project. The ultra-limited supply (10,000 FXC) and unique economic model create an unprecedented experiment in digital scarcity.

**Key Risks:**
- Experimental tokenomics with no prior precedent
- Repository will be archived - no future development or bug fixes
- Network security post-distribution depends entirely on transaction fees
- Extremely low supply may lead to high price volatility
- No central authority, foundation, or ongoing support

**This is not financial advice. Do Your Own Research (DYOR).**

Only participate with funds you can afford to lose entirely.

## 📜 License

FixedCoin is released under the MIT License. See [LICENSE](LICENSE) for details.

## 🔒 The Fixed Promise

Once block 1 is mined, this repository will be **permanently archived**:

- ✅ No code changes
- ✅ No governance
- ✅ No updates
- ✅ No ICO or VC funding
- ✅ No foundation
- ✅ Pure immutability

**Everything is Fixed. Forever.**

---

**Built on Bitcoin's proven technology. Secured by SHA-256. Limited to 10,000 coins.**

*Always verify file integrity by checking SHA256 hashes before running any binaries.*
