package com;

import com.thanos.web3j.abi.EventEncoder;
import com.thanos.web3j.abi.EventValues;
import com.thanos.web3j.abi.TypeReference;
import com.thanos.web3j.abi.datatypes.Address;
import com.thanos.web3j.abi.datatypes.Bool;
import com.thanos.web3j.abi.datatypes.DynamicBytes;
import com.thanos.web3j.abi.datatypes.Event;
import com.thanos.web3j.abi.datatypes.Function;
import com.thanos.web3j.abi.datatypes.Type;
import com.thanos.web3j.abi.datatypes.generated.Bytes4;
import com.thanos.web3j.abi.datatypes.generated.Uint256;
import com.thanos.web3j.channel.client.TransactionSucCallback;
import com.thanos.web3j.crypto.Credentials;
import com.thanos.web3j.model.ThanosTransactionReceipt;
import com.thanos.web3j.protocol.Web3j;
import com.thanos.web3j.protocol.core.DefaultBlockParameter;
import com.thanos.web3j.protocol.core.methods.request.EthFilter;
import com.thanos.web3j.protocol.core.methods.response.Log;
import com.thanos.web3j.tx.Contract;
import com.thanos.web3j.tx.TransactionManager;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import rx.Observable;
import rx.functions.Func1;

/**
 * Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>, or {@link com.thanos.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 */
public final class IERC721 extends Contract {
    private static String BINARY = "";

    public static final String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"interfaceId\",\"type\":\"bytes4\"}],\"name\":\"supportsInterface\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"getApproved\",\"outputs\":[{\"name\":\"operator\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"approve\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"transferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"ownerOf\",\"outputs\":[{\"name\":\"owner\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"}],\"name\":\"balanceOf\",\"outputs\":[{\"name\":\"balance\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"operator\",\"type\":\"address\"},{\"name\":\"_approved\",\"type\":\"bool\"}],\"name\":\"setApprovalForAll\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"},{\"name\":\"data\",\"type\":\"bytes\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"},{\"name\":\"operator\",\"type\":\"address\"}],\"name\":\"isApprovedForAll\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"from\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"to\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Transfer\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"approved\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Approval\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"operator\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"ApprovalForAll\",\"type\":\"event\"}]";

    private IERC721(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private IERC721(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private IERC721(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private IERC721(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static List<TransferEventResponse> getTransferEvents(ThanosTransactionReceipt transactionReceipt) {
        final Event event = new Event("Transfer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            TransferEventResponse typedResponse = new TransferEventResponse();
            typedResponse.from = (Address) eventValues.getIndexedValues().get(0);
            typedResponse.to = (Address) eventValues.getIndexedValues().get(1);
            typedResponse.tokenId = (Uint256) eventValues.getIndexedValues().get(2);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<TransferEventResponse> transferEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Transfer", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
            @Override
            public TransferEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                TransferEventResponse typedResponse = new TransferEventResponse();
                typedResponse.from = (Address) eventValues.getIndexedValues().get(0);
                typedResponse.to = (Address) eventValues.getIndexedValues().get(1);
                typedResponse.tokenId = (Uint256) eventValues.getIndexedValues().get(2);
                return typedResponse;
            }
        });
    }

    public static List<ApprovalEventResponse> getApprovalEvents(ThanosTransactionReceipt transactionReceipt) {
        final Event event = new Event("Approval", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
            typedResponse.owner = (Address) eventValues.getIndexedValues().get(0);
            typedResponse.approved = (Address) eventValues.getIndexedValues().get(1);
            typedResponse.tokenId = (Uint256) eventValues.getIndexedValues().get(2);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ApprovalEventResponse> approvalEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("Approval", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}, new TypeReference<Uint256>() {}),
                Arrays.<TypeReference<?>>asList());
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalEventResponse>() {
            @Override
            public ApprovalEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
                typedResponse.owner = (Address) eventValues.getIndexedValues().get(0);
                typedResponse.approved = (Address) eventValues.getIndexedValues().get(1);
                typedResponse.tokenId = (Uint256) eventValues.getIndexedValues().get(2);
                return typedResponse;
            }
        });
    }

    public static List<ApprovalForAllEventResponse> getApprovalForAllEvents(ThanosTransactionReceipt transactionReceipt) {
        final Event event = new Event("ApprovalForAll", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<ApprovalForAllEventResponse> responses = new ArrayList<ApprovalForAllEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
            typedResponse.owner = (Address) eventValues.getIndexedValues().get(0);
            typedResponse.operator = (Address) eventValues.getIndexedValues().get(1);
            typedResponse.approved = (Bool) eventValues.getNonIndexedValues().get(0);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<ApprovalForAllEventResponse> approvalForAllEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("ApprovalForAll", 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalForAllEventResponse>() {
            @Override
            public ApprovalForAllEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                ApprovalForAllEventResponse typedResponse = new ApprovalForAllEventResponse();
                typedResponse.owner = (Address) eventValues.getIndexedValues().get(0);
                typedResponse.operator = (Address) eventValues.getIndexedValues().get(1);
                typedResponse.approved = (Bool) eventValues.getNonIndexedValues().get(0);
                return typedResponse;
            }
        });
    }

    public Future<Bool> supportsInterface(Bytes4 interfaceId, Set executeStates) {
        Function function = new Function("supportsInterface", 
                Arrays.<Type>asList(interfaceId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Address> getApproved(Uint256 tokenId, Set executeStates) {
        Function function = new Function("getApproved", 
                Arrays.<Type>asList(tokenId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<ThanosTransactionReceipt> approve(Address to, Uint256 tokenId, Set executeStates) {
        Function function = new Function("approve", Arrays.<Type>asList(to, tokenId), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void approve(Address to, Uint256 tokenId, TransactionSucCallback callback) {
        Function function = new Function("approve", Arrays.<Type>asList(to, tokenId), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<ThanosTransactionReceipt> transferFrom(Address from, Address to, Uint256 tokenId, Set executeStates) {
        Function function = new Function("transferFrom", Arrays.<Type>asList(from, to, tokenId), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void transferFrom(Address from, Address to, Uint256 tokenId, TransactionSucCallback callback) {
        Function function = new Function("transferFrom", Arrays.<Type>asList(from, to, tokenId), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<ThanosTransactionReceipt> safeTransferFrom(Address from, Address to, Uint256 tokenId, Set executeStates) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void safeTransferFrom(Address from, Address to, Uint256 tokenId, TransactionSucCallback callback) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Address> ownerOf(Uint256 tokenId, Set executeStates) {
        Function function = new Function("ownerOf", 
                Arrays.<Type>asList(tokenId), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> balanceOf(Address owner, Set executeStates) {
        Function function = new Function("balanceOf", 
                Arrays.<Type>asList(owner), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<ThanosTransactionReceipt> setApprovalForAll(Address operator, Bool _approved, Set executeStates) {
        Function function = new Function("setApprovalForAll", Arrays.<Type>asList(operator, _approved), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void setApprovalForAll(Address operator, Bool _approved, TransactionSucCallback callback) {
        Function function = new Function("setApprovalForAll", Arrays.<Type>asList(operator, _approved), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<ThanosTransactionReceipt> safeTransferFrom(Address from, Address to, Uint256 tokenId, DynamicBytes data, Set executeStates) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId, data), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void safeTransferFrom(Address from, Address to, Uint256 tokenId, DynamicBytes data, TransactionSucCallback callback) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId, data), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Bool> isApprovedForAll(Address owner, Address operator, Set executeStates) {
        Function function = new Function("isApprovedForAll", 
                Arrays.<Type>asList(owner, operator), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<IERC721> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC721.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<IERC721> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(IERC721.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static IERC721 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static IERC721 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static IERC721 loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static IERC721 loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new IERC721(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }

    public static class TransferEventResponse {
        public Address from;

        public Address to;

        public Uint256 tokenId;
    }

    public static class ApprovalEventResponse {
        public Address owner;

        public Address approved;

        public Uint256 tokenId;
    }

    public static class ApprovalForAllEventResponse {
        public Address owner;

        public Address operator;

        public Bool approved;
    }
}
