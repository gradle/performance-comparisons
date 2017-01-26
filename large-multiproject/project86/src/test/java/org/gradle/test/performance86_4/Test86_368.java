package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_368 {
    private final Production86_368 production = new Production86_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}