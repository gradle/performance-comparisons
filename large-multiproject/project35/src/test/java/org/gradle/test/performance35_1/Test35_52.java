package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_52 {
    private final Production35_52 production = new Production35_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}