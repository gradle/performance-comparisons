package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_250 {
    private final Production86_250 production = new Production86_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}