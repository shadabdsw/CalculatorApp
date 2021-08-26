public class a {
    public String evalExpression(String t) {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            System.out.println(engine.eval(t));
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        try {
            return engine.eval(t).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return "Error Occured";
    }
}
