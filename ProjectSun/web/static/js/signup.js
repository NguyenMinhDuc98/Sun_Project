$(document).ready(function() {
    var name = $('input[name = "username"]');
    var email = $('input[name="email"]');
    var password = $('input[name="password"]');
    var flag = false;

    function isEmail(email) {
        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        return regex.test(email);
    }

    $('li').hide();

    function checkUsername() {
        //validate name
        if (name.val() == "") {
            $('#empty_name').show();
            $('#short_name').hide();
            flag = false;
        } else if (name.val() != "" && name.val().length < 4) {
            $('#short_name').show();
            $('#empty_name').hide();
            flag = false;
        } else {
            $('#empty_name').hide();
            $('#short_name').hide();
            flag = true;
        }
        return flag;
    }

    function checkEmail() {
        //validate email
        if (email.val() == "") {
            $('#empty_email').show();
            $('#invalid_email').hide();
            flag = false;
        } else if (email.val() != "" && !isEmail(email.val())) {
            $('#empty_email').hide();
            $('#invalid_email').show();
            flag = false;
        } else {
            $('#empty_email').hide();
            $('#invalid_email').hide();
            flag = true;
        }
        return flag;
    }

    function checkPassword() {
        //validate password
        if (password.val() == "") {
            $('#empty_password').show();
            $('#short_password').hide();
            flag = false;
        } else if (password.val() != "" && password.val().length < 4) {
            $('#empty_password').hide();
            $('#short_password').show();
            flag = false;
        } else {
            $('#empty_password').hide();
            $('#short_password').hide();
            flag = true;
        }
        return flag;
    }
    $('input[type="submit"]').on('click', function() {
        checkUsername();
        checkEmail();
        checkPassword();

        $('#flag').text(flag);

        // form cannot submit if still have error
        if (flag == false) {
            $('#myForm').on('submit', function(e) {
                e.preventDefault();
            });
        }
    })

})