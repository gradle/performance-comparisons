package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_334 {
    private final Production86_334 production = new Production86_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}