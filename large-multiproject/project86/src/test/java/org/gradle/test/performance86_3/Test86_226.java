package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_226 {
    private final Production86_226 production = new Production86_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}