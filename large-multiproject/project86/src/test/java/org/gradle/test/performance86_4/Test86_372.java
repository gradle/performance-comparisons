package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_372 {
    private final Production86_372 production = new Production86_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}