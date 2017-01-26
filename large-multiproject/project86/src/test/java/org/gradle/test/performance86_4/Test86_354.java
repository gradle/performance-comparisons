package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_354 {
    private final Production86_354 production = new Production86_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}