public class Token {

        public String kind;
        public String value;

        @Override
        public String toString() {
            return kind + " \"" + value + "\"";
        }

}
