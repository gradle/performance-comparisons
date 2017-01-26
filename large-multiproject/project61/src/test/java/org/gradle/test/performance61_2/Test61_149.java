package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_149 {
    private final Production61_149 production = new Production61_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}