package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_23 {
    private final Production61_23 production = new Production61_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}