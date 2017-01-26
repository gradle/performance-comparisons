package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_153 {
    private final Production61_153 production = new Production61_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}