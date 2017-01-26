package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_472 {
    private final Production86_472 production = new Production86_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}