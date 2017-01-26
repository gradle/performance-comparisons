package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_414 {
    private final Production61_414 production = new Production61_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}