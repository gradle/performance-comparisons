package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_11 {
    private final Production23_11 production = new Production23_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}