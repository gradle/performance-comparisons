package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_375 {
    private final Production86_375 production = new Production86_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}