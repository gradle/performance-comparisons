package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_385 {
    private final Production86_385 production = new Production86_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}