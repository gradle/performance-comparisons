package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_301 {
    private final Production61_301 production = new Production61_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}