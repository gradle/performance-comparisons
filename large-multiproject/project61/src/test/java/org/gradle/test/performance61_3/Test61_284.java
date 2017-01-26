package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_284 {
    private final Production61_284 production = new Production61_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}