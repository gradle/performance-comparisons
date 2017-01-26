package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_233 {
    private final Production86_233 production = new Production86_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}