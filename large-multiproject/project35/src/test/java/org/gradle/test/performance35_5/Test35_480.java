package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_480 {
    private final Production35_480 production = new Production35_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}