package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_291 {
    private final Production35_291 production = new Production35_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}