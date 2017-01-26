package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_248 {
    private final Production61_248 production = new Production61_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}