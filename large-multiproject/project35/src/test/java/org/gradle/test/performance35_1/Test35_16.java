package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_16 {
    private final Production35_16 production = new Production35_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}