package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_256 {
    private final Production61_256 production = new Production61_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}