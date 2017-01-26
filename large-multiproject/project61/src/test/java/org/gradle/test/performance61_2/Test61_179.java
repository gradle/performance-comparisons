package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_179 {
    private final Production61_179 production = new Production61_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}