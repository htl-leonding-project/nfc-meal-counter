import apdu4j.pcsc.TerminalManager;
import apdu4j.pcsc.terminals.LoggingCardTerminal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
       TerminalManager.fixPlatformPaths();
/*
        TerminalFactory f = TerminalFactory.getDefault();
        CardTerminal r = f.terminals().getTerminal("ACR122U");
        LoggingCardTerminal reader = LoggingCardTerminal.getInstance(r);

*/
        Class<?> aClass = null;

            aClass = Class.forName("apdu4j.tool.SCTool");

        Method meth = null;
            meth = aClass.getMethod("main", String[].class);


        String[] params = {"apdu4j.tool.SCTool"}; // init params accordingly

            meth.invoke(null, (Object) params); // static method doesn't have an instance

        System.out.println(aClass);

    }

    public static void test(String[] args){

        SCTool tool = new SCTool();
        CommandLine cli = new CommandLine(tool);

        // To support "sc gp -ldv"
        cli.setUnmatchedOptionsArePositionalParams(true);
        //cli.setStopAtUnmatched(true);
        cli.setStopAtPositional(true);
        cli.registerConverter(byte[].class, HexUtils::stringToBin);
        try {
            cli.parseArgs(args);
        } catch (ParameterException ex) { // command line arguments could not be parsed
            System.err.println(ex.getMessage());
            ex.getCommandLine().usage(System.err);
            System.exit(1);
        }
    }
}

