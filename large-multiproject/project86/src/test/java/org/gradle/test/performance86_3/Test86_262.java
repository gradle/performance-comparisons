package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_262 {
    private final Production86_262 production = new Production86_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}