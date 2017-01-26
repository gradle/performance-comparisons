package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_473 {
    private final Production86_473 production = new Production86_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}