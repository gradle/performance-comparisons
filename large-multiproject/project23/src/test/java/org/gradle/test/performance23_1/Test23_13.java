package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_13 {
    private final Production23_13 production = new Production23_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}