package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_124 {
    private final Production61_124 production = new Production61_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}