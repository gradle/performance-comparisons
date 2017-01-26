package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_115 {
    private final Production86_115 production = new Production86_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}