package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_397 {
    private final Production86_397 production = new Production86_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}