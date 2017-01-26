package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_178 {
    private final Production35_178 production = new Production35_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}