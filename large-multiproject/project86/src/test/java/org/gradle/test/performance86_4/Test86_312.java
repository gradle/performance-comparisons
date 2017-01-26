package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_312 {
    private final Production86_312 production = new Production86_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}