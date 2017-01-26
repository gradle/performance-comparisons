package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_486 {
    private final Production35_486 production = new Production35_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}