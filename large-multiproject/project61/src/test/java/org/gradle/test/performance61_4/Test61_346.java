package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_346 {
    private final Production61_346 production = new Production61_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}