package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_485 {
    private final Production35_485 production = new Production35_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}