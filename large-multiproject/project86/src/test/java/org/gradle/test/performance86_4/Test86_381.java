package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_381 {
    private final Production86_381 production = new Production86_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}