pragma solidity 0.4.25;

import "./ISimpleStorage.sol";

contract SimpleStorage is ISimpleStorage{
    event SetSuccess(address sender, uint x, uint y);
    mapping (address => uint) storedData;

    function set(uint _data) external {
        address sender = msg.sender;
        uint before = storedData[sender];
        storedData[msg.sender] = _data;
        
        emit SetSuccess(sender, before, storedData[msg.sender]);
    }

    function get(address _addr) external view returns (uint) {
        return storedData[_addr];
    }
}
