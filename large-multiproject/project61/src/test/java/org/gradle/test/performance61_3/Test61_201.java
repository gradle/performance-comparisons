package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_201 {
    private final Production61_201 production = new Production61_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}