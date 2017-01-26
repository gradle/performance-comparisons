package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_316 {
    private final Production23_316 production = new Production23_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}