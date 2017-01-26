package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_344 {
    private final Production61_344 production = new Production61_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}