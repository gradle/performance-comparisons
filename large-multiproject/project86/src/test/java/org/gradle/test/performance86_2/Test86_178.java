package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_178 {
    private final Production86_178 production = new Production86_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}