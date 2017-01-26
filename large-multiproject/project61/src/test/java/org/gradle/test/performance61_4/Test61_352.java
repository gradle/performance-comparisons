package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_352 {
    private final Production61_352 production = new Production61_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}