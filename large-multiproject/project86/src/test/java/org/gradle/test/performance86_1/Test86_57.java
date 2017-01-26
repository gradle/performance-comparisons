package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_57 {
    private final Production86_57 production = new Production86_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}