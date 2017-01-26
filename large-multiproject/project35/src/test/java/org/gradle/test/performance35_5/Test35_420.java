package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_420 {
    private final Production35_420 production = new Production35_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}