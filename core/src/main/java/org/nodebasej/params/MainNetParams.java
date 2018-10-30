package org.nodebasej.params;

import org.nodebasej.core.Block;
import org.nodebasej.core.CoinDefinition;

import static com.google.common.base.Preconditions.*;

















public class MainNetParams
  extends AbstractBitcoinNetParams
{
  public static final int MAINNET_MAJORITY_WINDOW = 1000;
  public static final int MAINNET_MAJORITY_REJECT_BLOCK_OUTDATED = 950;
  public static final int MAINNET_MAJORITY_ENFORCE_BLOCK_UPGRADE = 750;
  private static MainNetParams instance;
  
  public MainNetParams()
  {
    interval = 1440;
    targetTimespan = 86400;
    maxTarget = CoinDefinition.proofOfWorkLimit;
    dumpedPrivateKeyHeader = 212;
    addressHeader = 28;
    p2shHeader = 63;
    acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
    //acceptableAddressCodes = new int[] {  };
    port = 22001;
    packetMagic = 1148417350L;
    bip32HeaderPub = 36513075;
    bip32HeaderPriv = 35729707;
    genesisBlock.setDifficultyTarget(CoinDefinition.genesisBlockDifficultyTarget);
    genesisBlock.setTime(CoinDefinition.genesisBlockTime);
    genesisBlock.setNonce(CoinDefinition.genesisBlockNonce);
    
    majorityEnforceBlockUpgrade = 750;
    majorityRejectBlockOutdated = 950;
    majorityWindow = 1000;
    
    id = "org.nodebase.production";
    subsidyDecreaseBlockCount = CoinDefinition.subsidyDecreaseBlockCount;
    spendableCoinbaseDepth = CoinDefinition.spendableCoinbaseDepth;
    String genesisHash = genesisBlock.getHashAsString();
    System.out.println(">>01:"+genesisHash);
    System.out.println(">>02:"+CoinDefinition.genesisHash);
    checkState(genesisHash.equals(CoinDefinition.genesisHash), genesisHash);



    CoinDefinition.initCheckpoints(checkpoints);
    
    zerocoinStartedHeight = 2147483647L;
    
    dnsSeeds = CoinDefinition.dnsSeeds;
    
    httpSeeds = null;
    

























    addrSeeds = null;
    









































    strSporkKey = "04f624e17101fc210e609e161e2ef58745af485e26cabd51681c2c25953958dae5b549d636a73ea94840bc7eb720c43f26f1624596e8f1920ee37732ad9d6001eb";
  }
  
  public static synchronized MainNetParams get()
  {
    if (instance == null) {
      instance = new MainNetParams();
    }
    return instance;
  }
  
  public String getPaymentProtocolId()
  {
    return "main";
  }
}
