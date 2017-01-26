package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_359 {
    private final Production86_359 production = new Production86_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}