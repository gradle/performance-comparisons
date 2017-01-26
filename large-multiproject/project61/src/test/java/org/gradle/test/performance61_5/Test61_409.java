package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_409 {
    private final Production61_409 production = new Production61_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}