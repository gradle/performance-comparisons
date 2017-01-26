package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_20 {
    private final Production35_20 production = new Production35_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}