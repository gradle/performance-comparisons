package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_327 {
    private final Production61_327 production = new Production61_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}