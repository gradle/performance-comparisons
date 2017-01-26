package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_299 {
    private final Production61_299 production = new Production61_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}