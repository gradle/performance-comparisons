package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_110 {
    private final Production86_110 production = new Production86_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}