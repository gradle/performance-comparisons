package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_448 {
    private final Production61_448 production = new Production61_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}