package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_487 {
    private final Production61_487 production = new Production61_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}