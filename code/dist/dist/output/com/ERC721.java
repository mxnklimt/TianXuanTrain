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
public final class ERC721 extends Contract {
    private static String BINARY = "608060405234801561001057600080fd5b506111d3806100206000396000f3006080604052600436106100a4576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806301ffc9a7146100a9578063081812fc1461010d578063095ea7b31461017a57806323b872dd146101c757806342842e0e146102345780636352211e146102a157806370a082311461030e578063a22cb46514610365578063b88d4fde146103b4578063e985e9c514610467575b600080fd5b3480156100b557600080fd5b506100f360048036038101908080357bffffffffffffffffffffffffffffffffffffffffffffffffffffffff191690602001909291905050506104e2565b604051808215151515815260200191505060405180910390f35b34801561011957600080fd5b5061013860048036038101908080359060200190929190505050610551565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561018657600080fd5b506101c5600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001909291905050506105a2565b005b3480156101d357600080fd5b50610232600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001909291905050506106e7565b005b34801561024057600080fd5b5061029f600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803590602001909291905050506107b6565b005b3480156102ad57600080fd5b506102cc600480360381019080803590602001909291905050506107d7565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561031a57600080fd5b5061034f600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610854565b6040518082815260200191505060405180910390f35b34801561037157600080fd5b506103b2600480360381019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035151590602001909291905050506108d8565b005b3480156103c057600080fd5b50610465600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290505050610a14565b005b34801561047357600080fd5b506104c8600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610a3c565b604051808215151515815260200191505060405180910390f35b6000807c010000000000000000000000000000000000000000000000000000000002826380ac58cd7c010000000000000000000000000000000000000000000000000000000002187bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916149050919050565b600061055c82610ad0565b151561056757600080fd5b6001600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050919050565b60006105ad826107d7565b90508073ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff16141515156105ea57600080fd5b8073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff16148061062a57506106298133610a3c565b5b151561063557600080fd5b826001600084815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550818373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b92560405160405180910390a4505050565b6106f13382610b41565b15156106fc57600080fd5b600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415151561073857600080fd5b6107428382610bd6565b61074c8382610cd9565b6107568282610e40565b808273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60405160405180910390a4505050565b6107d28383836020604051908101604052806000815250610a14565b505050565b60008060008084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff161415151561084b57600080fd5b80915050919050565b60008073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415151561089157600080fd5b600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b3373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415151561091357600080fd5b80600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055508173ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c3183604051808215151515815260200191505060405180910390a35050565b610a1f8484846106e7565b610a2b84848484610f88565b1515610a3657600080fd5b50505050565b6000600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16905092915050565b60008060008084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff161415915050919050565b600080610b4d836107d7565b90508073ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff161480610bbc57508373ffffffffffffffffffffffffffffffffffffffff16610ba484610551565b73ffffffffffffffffffffffffffffffffffffffff16145b80610bcd5750610bcc8185610a3c565b5b91505092915050565b8173ffffffffffffffffffffffffffffffffffffffff16610bf6826107d7565b73ffffffffffffffffffffffffffffffffffffffff16141515610c1857600080fd5b600073ffffffffffffffffffffffffffffffffffffffff166001600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610cd55760006001600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5050565b8173ffffffffffffffffffffffffffffffffffffffff16610cf9826107d7565b73ffffffffffffffffffffffffffffffffffffffff16141515610d1b57600080fd5b6000600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020541115610dea576001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205403600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055505b600080600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b600073ffffffffffffffffffffffffffffffffffffffff1660008083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610ead57600080fd5b8160008083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205401600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055505050565b600080610f9485611194565b1515610fa3576001915061118b565b8473ffffffffffffffffffffffffffffffffffffffff1663150b7a02338887876040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561109857808201518184015260208101905061107d565b50505050905090810190601f1680156110c55780820380516001836020036101000a031916815260200191505b5095505050505050602060405180830381600087803b1580156110e757600080fd5b505af11580156110fb573d6000803e3d6000fd5b505050506040513d602081101561111157600080fd5b8101908080519060200190929190505050905063150b7a027c0100000000000000000000000000000000000000000000000000000000027bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916817bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161491505b50949350505050565b600080823b9050600081119150509190505600a165627a7a723058206178e2b1bf75dacf9a049052145490346e9fcd1d19523cd290f01348464657fe0029";

    public static final String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"interfaceId\",\"type\":\"bytes4\"}],\"name\":\"supportsInterface\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"getApproved\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"approve\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"transferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"ownerOf\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"}],\"name\":\"balanceOf\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"setApprovalForAll\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"},{\"name\":\"_data\",\"type\":\"bytes\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"},{\"name\":\"operator\",\"type\":\"address\"}],\"name\":\"isApprovedForAll\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"from\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"to\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Transfer\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"approved\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Approval\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"operator\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"ApprovalForAll\",\"type\":\"event\"}]";

    private ERC721(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private ERC721(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private ERC721(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private ERC721(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
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

    public Future<ThanosTransactionReceipt> setApprovalForAll(Address to, Bool approved, Set executeStates) {
        Function function = new Function("setApprovalForAll", Arrays.<Type>asList(to, approved), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void setApprovalForAll(Address to, Bool approved, TransactionSucCallback callback) {
        Function function = new Function("setApprovalForAll", Arrays.<Type>asList(to, approved), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<ThanosTransactionReceipt> safeTransferFrom(Address from, Address to, Uint256 tokenId, DynamicBytes _data, Set executeStates) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId, _data), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void safeTransferFrom(Address from, Address to, Uint256 tokenId, DynamicBytes _data, TransactionSucCallback callback) {
        Function function = new Function("safeTransferFrom", Arrays.<Type>asList(from, to, tokenId, _data), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public Future<Bool> isApprovedForAll(Address owner, Address operator, Set executeStates) {
        Function function = new Function("isApprovedForAll", 
                Arrays.<Type>asList(owner, operator), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public static Future<ERC721> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(ERC721.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<ERC721> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(ERC721.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static ERC721 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC721(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static ERC721 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC721(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static ERC721 loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC721(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static ERC721 loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ERC721(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
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
