package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_258 {
    private final Production61_258 production = new Production61_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}