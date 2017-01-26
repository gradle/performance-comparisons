package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_341 {
    private final Production86_341 production = new Production86_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}