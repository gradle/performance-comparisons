package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_335 {
    private final Production61_335 production = new Production61_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}