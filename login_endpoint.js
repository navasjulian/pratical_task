//IMPORT
const request = require('request');

const options = {
    url: 'https://www.shop-apotheke.com/auth/v1/com/login',
    json: true,
    headers: {
        'Content-Type': 'application/json'
         'Sae-Device-Type': 'browser',
    },
    body: {
        'customerNumber': 'valid_user',
        'password': 'valid_password'
    }
};

request.post(options, (err, res, body) => {
    if (err) {
        return console.log(err);
    }
    console.log(`Status: ${res.statusCode}`);
    console.log(`Status Message: ${res.statusMessage}`);
    
    if(res.statusCode == '201'){
        console.log('C01: Test passed')
    } else {
      console.log('C01: Test failed')    
    }

});
