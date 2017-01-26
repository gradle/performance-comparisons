package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_152 {
    private final Production35_152 production = new Production35_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}