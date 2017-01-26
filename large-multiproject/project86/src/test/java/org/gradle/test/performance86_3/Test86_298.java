package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_298 {
    private final Production86_298 production = new Production86_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}