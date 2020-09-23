package mainpackage;

import exceptions.InvalidMarkException;
import subjects.Subjects;

public class Mark {
    private Enum subject;
    private int mark;

    public Mark(Enum subject, int mark) {
        this.subject = subject;
        if (mark < 0 || mark > 5) throw new InvalidMarkException("Invalid mark: " + mark);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "subject:" + subject + " ,mark" + mark;
    }
}
