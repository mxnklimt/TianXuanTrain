package com;

import com.thanos.web3j.abi.TypeReference;
import com.thanos.web3j.abi.datatypes.Address;
import com.thanos.web3j.abi.datatypes.DynamicBytes;
import com.thanos.web3j.abi.datatypes.Function;
import com.thanos.web3j.abi.datatypes.Type;
import com.thanos.web3j.abi.datatypes.generated.Uint256;
import com.thanos.web3j.channel.client.TransactionSucCallback;
import com.thanos.web3j.crypto.Credentials;
import com.thanos.web3j.model.ThanosTransactionReceipt;
import com.thanos.web3j.protocol.Web3j;
import com.thanos.web3j.tx.Contract;
import com.thanos.web3j.tx.TransactionManager;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link com.thanos.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 */
public final class IERC721Receiver extends Contract {
    private static String BINARY = "";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"operator\",\"type\":\"address\"},{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"},{\"name\":\"data\",\"type\":\"bytes\"}],\"name\":\"onERC721Received\",\"outputs\":[{\"name\":\"\",\"type\":\"bytes4\"}],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"}]";

    private IERC721Receiver(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private IERC721Receiver(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private IERC721Receiver(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private IERC721Receiver(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public Future<ThanosTransactionReceipt> onERC721Received(Address operator, Address from, Uint256 tokenId, DynamicBytes data, Set executeStates) {
        Function function = new Function("onERC721Received", Arrays.<Type>asList(operator, from, tokenId, data), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void onERC721Received(Address operator, Address from, Uint256 tokenId, DynamicBytes data, TransactionSucCallback callback) {
        Function function = new Function("onERC721Received", Arrays.<Type>asList(operator, from, tokenId, data), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public static Future<IERC721Receiver> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC721Receiver.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<IERC721Receiver> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC721Receiver.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static IERC721Receiver load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721Receiver(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static IERC721Receiver load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721Receiver(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static IERC721Receiver loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721Receiver(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static IERC721Receiver loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721Receiver(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }
}
