package org.ethereum.listener;

import org.ethereum.core.Block;
import org.ethereum.core.Transaction;
import org.ethereum.net.message.Message;

import java.util.Set;

/**
 * www.ethereumJ.com
 *
 * @author: Roman Mandeleil
 * Created on: 27/07/2014 11:20
 */

public interface EthereumListener {

    public void trace(String output);
    public void onBlock(Block block);
    public void onRecvMessage(Message message);
    public void onSendMessage(Message message);
    public void onPeerDisconnect(String host, long port);
    public void onPendingTransactionsReceived(Set<Transaction> transactions);
    public void onSyncDone();
    public void onNoConnections();
}
