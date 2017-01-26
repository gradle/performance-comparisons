package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_291 {
    private final Production86_291 production = new Production86_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}