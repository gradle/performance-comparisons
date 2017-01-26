package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_232 {
    private final Production86_232 production = new Production86_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}