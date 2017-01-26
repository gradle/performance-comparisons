package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_316 {
    private final Production86_316 production = new Production86_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}