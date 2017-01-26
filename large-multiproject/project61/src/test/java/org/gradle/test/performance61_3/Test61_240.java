package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_240 {
    private final Production61_240 production = new Production61_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}