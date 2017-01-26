package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_273 {
    private final Production61_273 production = new Production61_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}