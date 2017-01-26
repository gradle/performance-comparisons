package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_433 {
    private final Production23_433 production = new Production23_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}