package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_462 {
    private final Production35_462 production = new Production35_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}