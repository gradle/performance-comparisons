package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_379 {
    private final Production35_379 production = new Production35_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}