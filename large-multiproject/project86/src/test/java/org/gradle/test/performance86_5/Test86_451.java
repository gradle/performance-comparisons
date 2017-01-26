package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_451 {
    private final Production86_451 production = new Production86_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}