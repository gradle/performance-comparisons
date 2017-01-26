package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_141 {
    private final Production61_141 production = new Production61_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}