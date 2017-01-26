package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_292 {
    private final Production61_292 production = new Production61_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}