package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_230 {
    private final Production23_230 production = new Production23_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}