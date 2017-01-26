package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_120 {
    private final Production86_120 production = new Production86_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}