package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_333 {
    private final Production35_333 production = new Production35_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}