package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_79 {
    private final Production61_79 production = new Production61_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}