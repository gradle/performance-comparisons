package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_295 {
    private final Production86_295 production = new Production86_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}