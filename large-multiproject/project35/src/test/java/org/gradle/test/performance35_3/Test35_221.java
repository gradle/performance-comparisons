package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_221 {
    private final Production35_221 production = new Production35_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}