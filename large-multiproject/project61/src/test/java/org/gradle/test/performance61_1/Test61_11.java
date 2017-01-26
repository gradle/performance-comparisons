package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_11 {
    private final Production61_11 production = new Production61_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}