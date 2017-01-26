package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_375 {
    private final Production61_375 production = new Production61_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}