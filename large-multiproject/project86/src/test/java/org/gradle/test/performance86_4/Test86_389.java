package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_389 {
    private final Production86_389 production = new Production86_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}