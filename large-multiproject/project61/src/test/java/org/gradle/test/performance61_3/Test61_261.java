package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_261 {
    private final Production61_261 production = new Production61_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}