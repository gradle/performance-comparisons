package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_429 {
    private final Production86_429 production = new Production86_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}