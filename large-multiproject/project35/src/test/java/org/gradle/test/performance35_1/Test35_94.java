package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_94 {
    private final Production35_94 production = new Production35_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}