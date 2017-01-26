package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_178 {
    private final Production40_178 production = new Production40_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}