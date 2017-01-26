package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_132 {
    private final Production86_132 production = new Production86_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}