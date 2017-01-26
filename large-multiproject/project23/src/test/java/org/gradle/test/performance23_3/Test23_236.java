package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_236 {
    private final Production23_236 production = new Production23_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}