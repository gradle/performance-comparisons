package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_201 {
    private final Production86_201 production = new Production86_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}