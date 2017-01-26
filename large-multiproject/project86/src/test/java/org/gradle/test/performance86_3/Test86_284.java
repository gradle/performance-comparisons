package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_284 {
    private final Production86_284 production = new Production86_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}