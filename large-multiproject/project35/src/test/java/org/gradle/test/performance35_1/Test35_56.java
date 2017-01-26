package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_56 {
    private final Production35_56 production = new Production35_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}