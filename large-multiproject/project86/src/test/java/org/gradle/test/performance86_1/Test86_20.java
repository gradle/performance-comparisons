package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_20 {
    private final Production86_20 production = new Production86_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}