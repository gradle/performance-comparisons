package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_160 {
    private final Production86_160 production = new Production86_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}