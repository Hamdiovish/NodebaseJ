package org.nodebasej.core;

import java.math.BigInteger;
import java.util.Map;






public class CoinDefinition
{
  public static final String coinName = "NodeBase";
  public static final String coinTicker = "NDB";
  public static final String coinURIScheme = "nodebase";
  public static final String cryptsyMarketId = "155";
  public static final String cryptsyMarketCurrency = "NDB";
  public static final String PATTERN_PRIVATE_KEY_START_UNCOMPRESSED = "[7]";
  public static final String PATTERN_PRIVATE_KEY_START_COMPRESSED = "[X]";
  public CoinDefinition() {}
  
  public static enum CoinPrecision
  {
    Coins, 
    Millicoins; }
  
  public static final CoinPrecision coinPrecision = CoinPrecision.Coins;
  public static final String UNSPENT_API_URL = "https://chainz.cryptoid.info/dash/api.dws?q=unspent";
  
  public static enum UnspentAPIType {
    BitEasy, 
    Blockr, 
    Abe, 
    Cryptoid; }
  
  public static final UnspentAPIType UnspentAPI = UnspentAPIType.Cryptoid;
  
  public static final String BLOCKEXPLORER_BASE_URL_PROD = "http://explorer.dash.org/";
  public static final String BLOCKEXPLORER_ADDRESS_PATH = "address/";
  public static final String BLOCKEXPLORER_TRANSACTION_PATH = "tx/";
  public static final String BLOCKEXPLORER_BLOCK_PATH = "block/";
  public static final String BLOCKEXPLORER_BASE_URL_TEST = "http://test.explorer.dash.org/";
  public static final String DONATION_ADDRESS = "Xdeh9YTLNtci5zSL4DDayRSVTLf299n9jv";
  
  static enum CoinHash
  {
    SHA256, 
    scrypt, 
    x11; }
  
  public static final CoinHash coinPOWHash = CoinHash.x11;
  
  public static boolean checkpointFileSupport = true;
  public static final int TARGET_TIMESPAN = 86400;
  public static final int TARGET_SPACING = 60;
  public static final int INTERVAL = 1440;
  
  public static final int getInterval(int height, boolean testNet)
  {
    return 1440;
  }
  
  public static final int getIntervalCheckpoints() { return 1440; }
  
  public static final int getTargetTimespan(int height, boolean testNet)
  {
    return 86400;
  }
  
  public static int spendableCoinbaseDepth = 100;
  
  public static final long MAX_COINS = 600000000L;
  
  public static final long DEFAULT_TX_FEE = 10000L;
  
  public static final long DEFAULT_MIN_TX_FEE = 10000L;
  
  public static final long DUST_LIMIT = 30000L;
  
  public static final long INSTANTX_FEE = 100000L;
  
  public static final boolean feeCanBeRaised = false;
  
  public static final int PROTOCOL_VERSION = 70915;
  
  public static final int MIN_PROTOCOL_VERSION = 70915;
  
  public static final int BLOCK_CURRENTVERSION = 1;
  
  public static final int MAX_BLOCK_SIZE = 1000000;
  
  public static final boolean supportsBloomFiltering = true;
  
  public static final int Port = 22001;
  
  public static final int TestPort = 51474;
  
  public static final long TESTNET_ZEROCOIN_STARTING_BLOCK_HEIGHT = 201564L;
  
  public static final long MAINNET_ZEROCOIN_STARTING_BLOCK_HEIGHT = 2147483647L;
  
  public static final int AddressHeader = 28;
  
  public static final int p2shHeader = 63;
  public static final int dumpedPrivateKeyHeader = 128;
  public static final long oldPacketMagic = -71256357L;
  public static final long PacketMagic = 1148417350L;
  public static long genesisBlockDifficultyTarget = 504365040L;
  public static long genesisBlockTime = 1534792829L;
  public static long genesisBlockNonce = 1250780L;
  public static String genesisHash = "000007e95600dfaabb7defd2b97ca02f0cb927e41e39f1a239a96f2671895d4c";
  public static String genesisMerkleRoot = "b2c056261007b6dcd5ecae1b950f5c01a9ed876372f1f73a4c39d143b91542bd";
  public static int genesisBlockValue = 0;
  
  public static String genesisTxInBytes = "04ffff001d0104404e6f64654241736520636861696e206d6164652077697468206c6f766520696e204575726f70652c416d65726963612c41736961204175672032302032303138";
  

  public static final String genesisTxPubKey = "04f624e17101fc210e609e161e2ef58745af485e26cabd51681c2c25953958dae5b549d636a73ea94840bc7eb720c43f26f1624596e8f1920ee37732ad9d6001eb";
  
  public static String[] dnsSeeds = {
  
    "206.189.166.205", "162.243.142.28", "45.77.1.83", "144.202.109.229", "207.148.118.251", "45.76.144.146", "199.247.26.183", "95.179.133.216", "45.32.229.123", "45.63.95.173", "209.250.241.250", "104.238.181.196", "198.13.34.219", "217.69.4.165", "159.65.162.123", "140.82.56.206" };
  

  public static int minBroadcastConnections = 2;
  
  public static final boolean supportsTestNet = true;
  
  public static final int testnetAddressHeader = 139;
  
  public static final int testnetp2shHeader = 19;
  
  public static final long testnetPacketMagic = 1165387194L;
  public static final String testnetGenesisHash = "0000041e482b9b9691d98eefb48473405c0b8ec31b76df3797c74a78680ef818";
  public static long testnetGenesisBlockDifficultyTarget = 504365040L;
  public static long testnetGenesisBlockTime = 1454124731L;
  public static long testnetGenesisBlockNonce = 2402015L;
  

  public static BigInteger testnetProofOfWorkLimit = Utils.decodeCompactBits(545259519L);
  



  public static final Coin GetBlockReward(int height)
  {
    int COIN = 1;
    Coin nSubsidy = Coin.valueOf(100, 0);
    if (height == 1)
      nSubsidy = Coin.valueOf(420000, 0);
    return nSubsidy;
  }
  
  public static int subsidyDecreaseBlockCount = 4730400;
  
  public static BigInteger proofOfWorkLimit = Utils.decodeCompactBits(504365055L);
  
  public static String[] testnetDnsSeeds = {
    "pivx-testnet.seed.fuzzbawls.pw", 
    "pivx-testnet.seed2.fuzzbawls.pw", 
    "s3v3nh4cks.ddns.net" };
  public static final String SATOSHI_KEY = "04f624e17101fc210e609e161e2ef58745af485e26cabd51681c2c25953958dae5b549d636a73ea94840bc7eb720c43f26f1624596e8f1920ee37732ad9d6001eb";
  public static final String TESTNET_SATOSHI_KEY = "000010e83b2703ccf322f7dbd62dd5855ac7c10bd055814ce121ba32607d573b8810c02c0582aed05b4deb9c4b77b26d92428c61256cd42774babea0a073b2ed0c9";
  public static final String ID_MAINNET = "org.nodebase.production";
  public static final String ID_TESTNET = "org.pivx.test";
  public static final String ID_UNITTESTNET = "com.google.pivx.unittest";
  public static final String UNITTEST_ADDRESS = "XgxQxd6B8iYgEEryemnJrpvoWZ3149MCkK";
  public static final String UNITTEST_ADDRESS_PRIVATE_KEY = "XDtvHyDHk4S3WJvwjxSANCpZiLLkKzoDnjrcRhca2iLQRtGEz1JZ";
  
  public static void initCheckpoints(Map<Integer, Sha256Hash> checkpoints) {}
}
