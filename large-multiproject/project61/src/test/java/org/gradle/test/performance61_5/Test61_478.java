package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_478 {
    private final Production61_478 production = new Production61_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}