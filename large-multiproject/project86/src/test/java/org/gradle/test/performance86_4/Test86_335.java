package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_335 {
    private final Production86_335 production = new Production86_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}