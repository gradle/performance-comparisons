package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_438 {
    private final Production61_438 production = new Production61_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}