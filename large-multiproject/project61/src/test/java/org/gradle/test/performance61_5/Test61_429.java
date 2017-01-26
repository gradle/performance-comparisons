package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_429 {
    private final Production61_429 production = new Production61_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}