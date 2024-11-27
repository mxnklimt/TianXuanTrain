package com;

import com.thanos.web3j.abi.TypeReference;
import com.thanos.web3j.abi.datatypes.Bool;
import com.thanos.web3j.abi.datatypes.Function;
import com.thanos.web3j.abi.datatypes.Type;
import com.thanos.web3j.abi.datatypes.generated.Bytes4;
import com.thanos.web3j.crypto.Credentials;
import com.thanos.web3j.protocol.Web3j;
import com.thanos.web3j.tx.Contract;
import com.thanos.web3j.tx.TransactionManager;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Future;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link com.thanos.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 */
public final class IERC165 extends Contract {
    private static String BINARY = "";

    public static final String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"interfaceId\",\"type\":\"bytes4\"}],\"name\":\"supportsInterface\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"}]";

    private IERC165(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private IERC165(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private IERC165(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private IERC165(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public Future<Bool> supportsInterface(Bytes4 interfaceId, Set executeStates) {
        Function function = new Function("supportsInterface", 
                Arrays.<Type>asList(interfaceId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<IERC165> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC165.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<IERC165> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC165.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static IERC165 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC165(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static IERC165 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC165(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static IERC165 loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC165(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static IERC165 loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC165(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }
}
