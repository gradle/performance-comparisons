package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_178 {
    private final Production48_178 production = new Production48_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}