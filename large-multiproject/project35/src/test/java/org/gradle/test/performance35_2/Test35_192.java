package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_192 {
    private final Production35_192 production = new Production35_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}