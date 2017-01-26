package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_24 {
    private final Production86_24 production = new Production86_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}