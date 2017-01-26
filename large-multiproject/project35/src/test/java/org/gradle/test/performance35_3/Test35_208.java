package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_208 {
    private final Production35_208 production = new Production35_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}