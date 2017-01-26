package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_279 {
    private final Production61_279 production = new Production61_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}