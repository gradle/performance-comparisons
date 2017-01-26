package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_160 {
    private final Production35_160 production = new Production35_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}