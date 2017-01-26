package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_122 {
    private final Production35_122 production = new Production35_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}