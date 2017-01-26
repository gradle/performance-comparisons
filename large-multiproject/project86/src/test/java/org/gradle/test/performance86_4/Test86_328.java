package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_328 {
    private final Production86_328 production = new Production86_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}