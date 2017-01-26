package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_420 {
    private final Production86_420 production = new Production86_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}