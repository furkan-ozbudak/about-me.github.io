    var accountCreator = (function () {
        var accountName;
        var amount;
        return {
            createAccount: function (name, amt) {
                accountName = name;
                amount = amt;
                return {name: accountName, balance: amount};
            }
        }
    })();
    var accountInfoList = [];
    function createNewAccount() {
        var newAccount = accountCreator.createAccount(document.getElementById("account_name").value, document.getElementById("amount").value);
        accountInfoList.push(newAccount);
        document.getElementById('display').value = '';
        for (account of accountInfoList) {
            document.getElementById('display').value += `Account name: ${account.name}, Balance: ${account.balance}\n`
        }
    }