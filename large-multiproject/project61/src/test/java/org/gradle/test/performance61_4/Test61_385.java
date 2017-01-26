package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_385 {
    private final Production61_385 production = new Production61_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}