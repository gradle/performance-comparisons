package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_129 {
    private final Production61_129 production = new Production61_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}