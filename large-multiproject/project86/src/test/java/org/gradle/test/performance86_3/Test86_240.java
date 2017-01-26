package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_240 {
    private final Production86_240 production = new Production86_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}