package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_274 {
    private final Production61_274 production = new Production61_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}