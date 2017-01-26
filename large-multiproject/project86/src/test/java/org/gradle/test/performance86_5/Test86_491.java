package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_491 {
    private final Production86_491 production = new Production86_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}