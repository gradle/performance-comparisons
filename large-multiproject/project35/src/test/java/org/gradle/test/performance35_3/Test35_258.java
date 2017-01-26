package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_258 {
    private final Production35_258 production = new Production35_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}