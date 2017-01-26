package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_178 {
    private final Production98_178 production = new Production98_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}