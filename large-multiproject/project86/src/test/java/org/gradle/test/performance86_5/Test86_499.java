package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_499 {
    private final Production86_499 production = new Production86_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}