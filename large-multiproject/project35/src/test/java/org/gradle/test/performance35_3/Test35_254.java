package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_254 {
    private final Production35_254 production = new Production35_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}