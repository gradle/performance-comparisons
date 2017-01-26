package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_394 {
    private final Production35_394 production = new Production35_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}