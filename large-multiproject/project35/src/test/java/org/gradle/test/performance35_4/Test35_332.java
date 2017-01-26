package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_332 {
    private final Production35_332 production = new Production35_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}