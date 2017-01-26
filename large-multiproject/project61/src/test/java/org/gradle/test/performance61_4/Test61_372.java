package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_372 {
    private final Production61_372 production = new Production61_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}