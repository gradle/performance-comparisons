package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_493 {
    private final Production86_493 production = new Production86_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}