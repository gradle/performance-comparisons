package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_280 {
    private final Production86_280 production = new Production86_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}