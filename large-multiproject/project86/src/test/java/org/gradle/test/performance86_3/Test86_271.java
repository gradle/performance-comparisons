package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_271 {
    private final Production86_271 production = new Production86_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}