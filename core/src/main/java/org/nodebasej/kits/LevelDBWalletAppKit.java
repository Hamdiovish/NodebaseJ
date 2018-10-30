package org.nodebasej.kits;

import org.nodebasej.core.NetworkParameters;
import org.nodebasej.store.BlockStore;
import org.nodebasej.store.BlockStoreException;
import org.nodebasej.store.LevelDBBlockStore;
import org.nodebasej.store.SPVBlockStore;

import java.io.File;

/**
 * Created by Eric on 2/23/2016.
 */
public class LevelDBWalletAppKit extends WalletAppKit {
    public LevelDBWalletAppKit(NetworkParameters params, File directory, String filePrefix) {
        super(params, directory, filePrefix);
    }

    /**
     * Override this to use a {@link BlockStore} that isn't the default of {@link SPVBlockStore}.
     */
    protected BlockStore provideBlockStore(File file) throws BlockStoreException {
        return new LevelDBBlockStore(context, file);
    }
}
