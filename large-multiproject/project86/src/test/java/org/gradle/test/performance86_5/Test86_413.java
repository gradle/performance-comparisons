package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_413 {
    private final Production86_413 production = new Production86_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}