package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_287 {
    private final Production86_287 production = new Production86_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}