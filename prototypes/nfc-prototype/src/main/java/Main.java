import apdu4j.LoggingCardTerminal;
import apdu4j.TerminalManager;
import apdu4j.LogginCardTerminal;
import jline.Terminal;
import jline.TerminalFactory;

public class Main {
    public static void main(String[] args) {
        TerminalManager.fixPlatformPaths();

        Terminal f = TerminalFactory.get();
        CardReader r = f.terminals().terminal("ACR122U");
        reader = LoggingCardTerminal.getInstance(reader);
    }
}
