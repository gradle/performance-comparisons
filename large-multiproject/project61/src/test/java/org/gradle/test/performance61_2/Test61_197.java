package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_197 {
    private final Production61_197 production = new Production61_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}