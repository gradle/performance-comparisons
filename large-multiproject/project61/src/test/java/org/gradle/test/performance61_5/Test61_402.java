package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_402 {
    private final Production61_402 production = new Production61_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}