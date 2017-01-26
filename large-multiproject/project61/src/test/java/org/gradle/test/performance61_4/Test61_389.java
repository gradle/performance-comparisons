package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_389 {
    private final Production61_389 production = new Production61_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}