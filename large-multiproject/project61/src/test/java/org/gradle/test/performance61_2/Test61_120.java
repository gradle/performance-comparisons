package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_120 {
    private final Production61_120 production = new Production61_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}