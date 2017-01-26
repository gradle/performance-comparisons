package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_493 {
    private final Production61_493 production = new Production61_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}