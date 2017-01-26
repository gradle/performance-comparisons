package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_384 {
    private final Production86_384 production = new Production86_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}