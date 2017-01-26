package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_399 {
    private final Production86_399 production = new Production86_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}