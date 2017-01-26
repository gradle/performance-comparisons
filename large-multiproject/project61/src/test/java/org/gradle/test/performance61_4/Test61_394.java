package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_394 {
    private final Production61_394 production = new Production61_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}