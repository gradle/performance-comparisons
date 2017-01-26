package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_410 {
    private final Production86_410 production = new Production86_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}