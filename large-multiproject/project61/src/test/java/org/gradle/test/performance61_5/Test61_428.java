package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_428 {
    private final Production61_428 production = new Production61_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}