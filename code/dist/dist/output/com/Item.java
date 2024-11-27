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
import com.thanos.web3j.abi.datatypes.Utf8String;
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
public final class Item extends Contract {
    private static String BINARY = "608060405234801561001057600080fd5b5033600560006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506116be806100616000396000f3006080604052600436106100c5576000357c0100000000000000000000000000000000000000000000000000000000900463ffffffff16806301ffc9a7146100ca578063081812fc1461012e578063095ea7b31461019b57806323b872dd146101e857806342842e0e146102555780636352211e146102c257806370a082311461032f5780638da5cb5b14610386578063a22cb465146103dd578063b88d4fde1461042c578063bfb231d2146104df578063e985e9c514610593578063fb54453b1461060e575b600080fd5b3480156100d657600080fd5b5061011460048036038101908080357bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19169060200190929190505050610697565b604051808215151515815260200191505060405180910390f35b34801561013a57600080fd5b5061015960048036038101908080359060200190929190505050610706565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b3480156101a757600080fd5b506101e6600480360381019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610757565b005b3480156101f457600080fd5b50610253600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019092919050505061089c565b005b34801561026157600080fd5b506102c0600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019092919050505061096b565b005b3480156102ce57600080fd5b506102ed6004803603810190808035906020019092919050505061098c565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b34801561033b57600080fd5b50610370600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610a09565b6040518082815260200191505060405180910390f35b34801561039257600080fd5b5061039b610a8d565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b3480156103e957600080fd5b5061042a600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803515159060200190929190505050610ab3565b005b34801561043857600080fd5b506104dd600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290505050610bef565b005b3480156104eb57600080fd5b5061050a60048036038101908080359060200190929190505050610c17565b6040518080602001848152602001838152602001828103825285818151815260200191508051906020019080838360005b8381101561055657808201518184015260208101905061053b565b50505050905090810190601f1680156105835780820380516001836020036101000a031916815260200191505b5094505050505060405180910390f35b34801561059f57600080fd5b506105f4600480360381019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610ce8565b604051808215151515815260200191505060405180910390f35b34801561061a57600080fd5b50610695600480360381019080803590602001908201803590602001908080601f0160208091040260200160405190810160405280939291908181526020018383808284378201915050505050509192919290803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610d7c565b005b6000807c010000000000000000000000000000000000000000000000000000000002826380ac58cd7c010000000000000000000000000000000000000000000000000000000002187bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916149050919050565b600061071182610e70565b151561071c57600080fd5b6001600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050919050565b60006107628261098c565b90508073ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff161415151561079f57600080fd5b8073ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614806107df57506107de8133610ce8565b5b15156107ea57600080fd5b826001600084815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550818373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b92560405160405180910390a4505050565b6108a63382610ee1565b15156108b157600080fd5b600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff16141515156108ed57600080fd5b6108f78382610f76565b6109018382611079565b61090b82826111e0565b808273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60405160405180910390a4505050565b6109878383836020604051908101604052806000815250610bef565b505050565b60008060008084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff1614151515610a0057600080fd5b80915050919050565b60008073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff1614151515610a4657600080fd5b600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020549050919050565b600560009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b3373ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff1614151515610aee57600080fd5b80600360003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055508173ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff167f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c3183604051808215151515815260200191505060405180910390a35050565b610bfa84848461089c565b610c0684848484611328565b1515610c1157600080fd5b50505050565b600481815481101515610c2657fe5b9060005260206000209060030201600091509050806000018054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610cd25780601f10610ca757610100808354040283529160200191610cd2565b820191906000526020600020905b815481529060010190602001808311610cb557829003601f168201915b5050505050908060010154908060020154905083565b6000600360008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16905092915050565b60003373ffffffffffffffffffffffffffffffffffffffff16600560009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16141515610dda57600080fd5b60048054905090506004606060405190810160405280858152602001600581526020016001815250908060018154018082558091505090600182039060005260206000209060030201600090919290919091506000820151816000019080519060200190610e499291906115ed565b506020820151816001015560408201518160020155505050610e6b8282611534565b505050565b60008060008084815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050600073ffffffffffffffffffffffffffffffffffffffff168173ffffffffffffffffffffffffffffffffffffffff161415915050919050565b600080610eed8361098c565b90508073ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff161480610f5c57508373ffffffffffffffffffffffffffffffffffffffff16610f4484610706565b73ffffffffffffffffffffffffffffffffffffffff16145b80610f6d5750610f6c8185610ce8565b5b91505092915050565b8173ffffffffffffffffffffffffffffffffffffffff16610f968261098c565b73ffffffffffffffffffffffffffffffffffffffff16141515610fb857600080fd5b600073ffffffffffffffffffffffffffffffffffffffff166001600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff161415156110755760006001600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505b5050565b8173ffffffffffffffffffffffffffffffffffffffff166110998261098c565b73ffffffffffffffffffffffffffffffffffffffff161415156110bb57600080fd5b6000600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002054111561118a576001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205403600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055505b600080600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055505050565b600073ffffffffffffffffffffffffffffffffffffffff1660008083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1614151561124d57600080fd5b8160008083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506001600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000205401600260008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020819055505050565b600080611334856115da565b1515611343576001915061152b565b8473ffffffffffffffffffffffffffffffffffffffff1663150b7a02338887876040518563ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b8381101561143857808201518184015260208101905061141d565b50505050905090810190601f1680156114655780820380516001836020036101000a031916815260200191505b5095505050505050602060405180830381600087803b15801561148757600080fd5b505af115801561149b573d6000803e3d6000fd5b505050506040513d60208110156114b157600080fd5b8101908080519060200190929190505050905063150b7a027c0100000000000000000000000000000000000000000000000000000000027bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916817bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161491505b50949350505050565b600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415151561157057600080fd5b61157a82826111e0565b808273ffffffffffffffffffffffffffffffffffffffff16600073ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60405160405180910390a45050565b600080823b905060008111915050919050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061162e57805160ff191683800117855561165c565b8280016001018555821561165c579182015b8281111561165b578251825591602001919060010190611640565b5b509050611669919061166d565b5090565b61168f91905b8082111561168b576000816000905550600101611673565b5090565b905600a165627a7a723058201e9399e12a430bc205035924b5d6ec1f3ba9693b56bdae270607257a242c7b340029";

    public static final String ABI = "[{\"constant\":true,\"inputs\":[{\"name\":\"interfaceId\",\"type\":\"bytes4\"}],\"name\":\"supportsInterface\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"getApproved\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"approve\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"transferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"ownerOf\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"}],\"name\":\"balanceOf\",\"outputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[],\"name\":\"owner\",\"outputs\":[{\"name\":\"\",\"type\":\"address\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"setApprovalForAll\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"from\",\"type\":\"address\"},{\"name\":\"to\",\"type\":\"address\"},{\"name\":\"tokenId\",\"type\":\"uint256\"},{\"name\":\"_data\",\"type\":\"bytes\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"\",\"type\":\"uint256\"}],\"name\":\"items\",\"outputs\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"level\",\"type\":\"uint256\"},{\"name\":\"rarityLevel\",\"type\":\"uint256\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":true,\"inputs\":[{\"name\":\"owner\",\"type\":\"address\"},{\"name\":\"operator\",\"type\":\"address\"}],\"name\":\"isApprovedForAll\",\"outputs\":[{\"name\":\"\",\"type\":\"bool\"}],\"payable\":false,\"stateMutability\":\"view\",\"type\":\"function\"},{\"constant\":false,\"inputs\":[{\"name\":\"_name\",\"type\":\"string\"},{\"name\":\"_to\",\"type\":\"address\"}],\"name\":\"createItem\",\"outputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[],\"payable\":false,\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"from\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"to\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Transfer\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"approved\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Approval\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"name\":\"operator\",\"type\":\"address\"},{\"indexed\":false,\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"ApprovalForAll\",\"type\":\"event\"}]";

    private Item(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, isInitByName);
    }

    private Item(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, Boolean isInitByName) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit, isInitByName);
    }

    private Item(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    private Item(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
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

    public Future<Address> owner(Set executeStates) {
        Function function = new Function("owner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
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

    public Future<List<Type>> items(Uint256 param0, Set executeStates) {
        Function function = new Function("items", 
                Arrays.<Type>asList(param0), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        return executeCallMultipleValueReturnAsync(function);
    }

    public Future<Bool> isApprovedForAll(Address owner, Address operator, Set executeStates) {
        Function function = new Function("isApprovedForAll", 
                Arrays.<Type>asList(owner, operator), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<ThanosTransactionReceipt> createItem(Utf8String _name, Address _to, Set executeStates) {
        Function function = new Function("createItem", Arrays.<Type>asList(_name, _to), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function, executeStates);
    }

    public void createItem(Utf8String _name, Address _to, TransactionSucCallback callback) {
        Function function = new Function("createItem", Arrays.<Type>asList(_name, _to), Collections.<TypeReference<?>>emptyList());
        executeTransactionAsync(function, callback);
    }

    public static Future<Item> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Item.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Future<Item> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialWeiValue) {
        return deployAsync(Item.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialWeiValue);
    }

    public static Item load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Item(contractAddress, web3j, credentials, gasPrice, gasLimit, false);
    }

    public static Item load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Item(contractAddress, web3j, transactionManager, gasPrice, gasLimit, false);
    }

    public static Item loadByName(String contractName, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Item(contractName, web3j, credentials, gasPrice, gasLimit, true);
    }

    public static Item loadByName(String contractName, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Item(contractName, web3j, transactionManager, gasPrice, gasLimit, true);
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
