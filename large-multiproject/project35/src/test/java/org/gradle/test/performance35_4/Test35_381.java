package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_381 {
    private final Production35_381 production = new Production35_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}