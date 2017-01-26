package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_490 {
    private final Production61_490 production = new Production61_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}