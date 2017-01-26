package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_116 {
    private final Production86_116 production = new Production86_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}