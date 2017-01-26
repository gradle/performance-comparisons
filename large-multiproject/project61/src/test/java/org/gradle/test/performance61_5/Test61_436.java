package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_436 {
    private final Production61_436 production = new Production61_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}