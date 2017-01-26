package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_302 {
    private final Production35_302 production = new Production35_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}