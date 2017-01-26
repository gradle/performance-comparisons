package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_178 {
    private final Production25_178 production = new Production25_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}