package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_22 {
    private final Production61_22 production = new Production61_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}