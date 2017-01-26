package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_272 {
    private final Production86_272 production = new Production86_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}