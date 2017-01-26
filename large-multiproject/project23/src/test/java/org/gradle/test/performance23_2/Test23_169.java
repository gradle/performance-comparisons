package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_169 {
    private final Production23_169 production = new Production23_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}