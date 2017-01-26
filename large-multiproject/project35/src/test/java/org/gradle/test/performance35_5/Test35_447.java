package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_447 {
    private final Production35_447 production = new Production35_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}