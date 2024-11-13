package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        StringBuilder mirror = new StringBuilder();

        int begin = 0;
        int end = string.length() - 1;

        // Traverse from both ends to find mirrored characters
        while (begin < string.length() && end >= 0 && string.charAt(begin) == string.charAt(end)) {
            mirror.append(string.charAt(begin));
            begin++;
            end--;
        }

        return mirror.toString();
    }
}
