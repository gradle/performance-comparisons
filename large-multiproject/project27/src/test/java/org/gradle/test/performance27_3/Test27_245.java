package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_245 {
    private final Production27_245 production = new Production27_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}