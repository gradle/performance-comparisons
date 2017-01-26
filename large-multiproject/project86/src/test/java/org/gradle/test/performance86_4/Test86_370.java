package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_370 {
    private final Production86_370 production = new Production86_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}