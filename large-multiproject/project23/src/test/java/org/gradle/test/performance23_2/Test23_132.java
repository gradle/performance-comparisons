package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_132 {
    private final Production23_132 production = new Production23_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}