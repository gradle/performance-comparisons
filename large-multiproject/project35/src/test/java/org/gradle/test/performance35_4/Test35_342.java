package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_342 {
    private final Production35_342 production = new Production35_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}