package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_237 {
    private final Production86_237 production = new Production86_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}