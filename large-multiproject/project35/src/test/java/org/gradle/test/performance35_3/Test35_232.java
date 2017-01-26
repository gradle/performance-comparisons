package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_232 {
    private final Production35_232 production = new Production35_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}