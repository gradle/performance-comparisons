package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_245 {
    private final Production61_245 production = new Production61_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}