package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_262 {
    private final Production61_262 production = new Production61_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}