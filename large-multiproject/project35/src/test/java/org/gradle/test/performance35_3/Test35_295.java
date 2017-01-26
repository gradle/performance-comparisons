package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_295 {
    private final Production35_295 production = new Production35_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}