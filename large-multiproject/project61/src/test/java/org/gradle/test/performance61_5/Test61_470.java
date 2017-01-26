package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_470 {
    private final Production61_470 production = new Production61_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}