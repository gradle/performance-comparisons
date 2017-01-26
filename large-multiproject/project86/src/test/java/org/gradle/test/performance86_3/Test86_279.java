package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_279 {
    private final Production86_279 production = new Production86_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}