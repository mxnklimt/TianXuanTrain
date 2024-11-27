// SPDX-License-Identifier: MIT
pragma solidity 0.4.25;

interface ISimpleStorage {
    function set(uint _data) external;

    function get(address _addr) external view returns (uint);
}