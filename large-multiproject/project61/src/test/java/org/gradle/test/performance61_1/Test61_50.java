package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_50 {
    private final Production61_50 production = new Production61_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}