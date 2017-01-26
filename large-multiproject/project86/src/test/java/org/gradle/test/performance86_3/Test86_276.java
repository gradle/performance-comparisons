package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_276 {
    private final Production86_276 production = new Production86_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}