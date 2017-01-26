package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_407 {
    private final Production86_407 production = new Production86_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}