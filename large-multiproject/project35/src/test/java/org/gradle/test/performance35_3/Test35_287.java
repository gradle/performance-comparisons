package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_287 {
    private final Production35_287 production = new Production35_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}