package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_368 {
    private final Production61_368 production = new Production61_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}