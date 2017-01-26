package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_124 {
    private final Production86_124 production = new Production86_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}