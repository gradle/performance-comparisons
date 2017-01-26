package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_473 {
    private final Production61_473 production = new Production61_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}