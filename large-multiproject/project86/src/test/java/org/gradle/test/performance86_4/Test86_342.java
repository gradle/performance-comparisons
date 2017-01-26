package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_342 {
    private final Production86_342 production = new Production86_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}