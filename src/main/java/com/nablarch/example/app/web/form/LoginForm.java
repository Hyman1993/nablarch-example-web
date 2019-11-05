package com.nablarch.example.app.web.form;

import java.io.Serializable;

import nablarch.core.log.Logger;
import nablarch.core.log.LoggerManager;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;
import nablarch.fw.dicontainer.web.RequestScoped;

/**
 * ログイン入力フォーム。
 *
 * @author Nabu Rakutaro
 */
@RequestScoped
public class LoginForm implements Serializable {

    /** ロガー **/
    private static final Logger LOGGER = LoggerManager.get(LoginForm.class);

    public LoginForm() {
        LOGGER.logDebug(getClass().getName() + " created.");
    }

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /** ログインID */
    @Required
    @Domain("loginId")
    private String loginId;

    /** パスワード */
    @Required
    @Domain("password")
    private String userPassword;

    /**
     * ログインIDを取得する。
     * @return ログインID
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * ログインIDを設定する。
     * @param loginId ログインID
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * パスワードを取得する。
     * @return パスワード
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * パスワードを設定する。
     * @param userPassword パスワード
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
