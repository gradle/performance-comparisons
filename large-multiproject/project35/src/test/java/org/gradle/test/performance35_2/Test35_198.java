package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_198 {
    private final Production35_198 production = new Production35_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}