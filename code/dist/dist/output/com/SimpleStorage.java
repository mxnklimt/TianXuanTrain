package com;

import com.thanos.web3j.abi.EventEncoder;
import com.thanos.web3j.abi.EventValues;
import com.thanos.web3j.abi.TypeReference;
import com.thanos.web3j.abi.datatypes.Address;
import com.thanos.web3j.abi.datatypes.Event;
import com.thanos.web3j.abi.datatypes.Function;
import com.thanos.web3j.abi.datatypes.Type;
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
public final class SimpleStorage extends Contract {
    private static String BINARY = "608060405234801561001057600080fd5b50610289806100206000396000f30060806040526004361061004c576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806360fe47b114610051578063c2bc2efc1461007e575b600080fd5b34801561005d57600080fd5b5061007c600480360381019080803590602001909291905050506100d5565b005b34801561008a57600080fd5b506100bf600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610215565b6040518082815260200191505060405180910390f35b6000803391506000808373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050826000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055507f9d43fb887ca5e0375cdad844c6ec425036dea5e63b0e82cd3598dea3810c515a82826000803373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054604051808473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001838152602001828152602001935050505060405180910390a1505050565b60008060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205490509190505600a165627a7a7230582084bb8584b5081aa28a560673df10c32201f74d4d0299bc79d16709b1c192fa650029";

    public static final String ABI = "[{\"constant\":false,\"inputs\":[{\"name\":\"_data\",\"type\":\"uint256\"}],\"name\":\"set\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"_addr\",\"type\":\"address\"}],\"name\":\"get\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":false,\"name\":\"sender\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"x\",\"type\":\"uint256\"},{\"indexed\":false,\"name\":\"y\",\"type\":\"uint256\"}],\"name\":\"SetSuccess\",\"type\":\"event\"}]";

    private SimpleStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private SimpleStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private SimpleStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private SimpleStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static List<SetSuccessEventResponse> getSetSuccessEvents(ThanosTransactionReceipt transactionReceipt) {
        final Event event = new Event("SetSuccess", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<EventValues> valueList = extractEventParameters(event, transactionReceipt);
        ArrayList<SetSuccessEventResponse> responses = new ArrayList<SetSuccessEventResponse>(valueList.size());
        for (EventValues eventValues : valueList) {
            SetSuccessEventResponse typedResponse = new SetSuccessEventResponse();
            typedResponse.sender = (Address) eventValues.getNonIndexedValues().get(0);
            typedResponse.x = (Uint256) eventValues.getNonIndexedValues().get(1);
            typedResponse.y = (Uint256) eventValues.getNonIndexedValues().get(2);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<SetSuccessEventResponse> setSuccessEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("SetSuccess", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, SetSuccessEventResponse>() {
            @Override
            public SetSuccessEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                SetSuccessEventResponse typedResponse = new SetSuccessEventResponse();
                typedResponse.sender = (Address) eventValues.getNonIndexedValues().get(0);
                typedResponse.x = (Uint256) eventValues.getNonIndexedValues().get(1);
                typedResponse.y = (Uint256) eventValues.getNonIndexedValues().get(2);
                return typedResponse;
            }
        });
    }

    public Future<ThanosTransactionReceipt> set(Uint256 _data, Set executeStates) {
        Function function = new Function("set", Arrays.<Type>asList(_data), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void set(Uint256 _data, TransactionSucCallback callback) {
        Function function = new Function("set", Arrays.<Type>asList(_data), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Uint256> get(Address _addr, Set executeStates) {
        Function function = new Function("get", 
                Arrays.<Type>asList(_addr), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<SimpleStorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(SimpleStorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<SimpleStorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(SimpleStorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static SimpleStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static SimpleStorage loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static SimpleStorage loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new SimpleStorage(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
    }

    public static class SetSuccessEventResponse {
        public Address sender;

        public Uint256 x;

        public Uint256 y;
    }
}
