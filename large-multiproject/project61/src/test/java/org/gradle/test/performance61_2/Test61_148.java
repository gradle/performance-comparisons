package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_148 {
    private final Production61_148 production = new Production61_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}