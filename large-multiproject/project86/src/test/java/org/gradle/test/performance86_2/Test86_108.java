package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_108 {
    private final Production86_108 production = new Production86_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}