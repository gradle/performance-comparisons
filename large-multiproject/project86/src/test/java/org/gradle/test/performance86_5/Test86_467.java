package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_467 {
    private final Production86_467 production = new Production86_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}