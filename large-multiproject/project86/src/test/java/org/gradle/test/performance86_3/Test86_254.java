package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_254 {
    private final Production86_254 production = new Production86_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}