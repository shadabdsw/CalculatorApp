package com.falcon;

import javax.script.*;

public class Evaluate {

    public String evalExpression(String t) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        try {
            return engine.eval(t).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }

        return "Error Occured";
    }
}

// This function uses JavaScript engine to get the final result of an expression.