package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_132 {
    private final Production61_132 production = new Production61_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}