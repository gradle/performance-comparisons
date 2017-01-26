package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_274 {
    private final Production86_274 production = new Production86_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}