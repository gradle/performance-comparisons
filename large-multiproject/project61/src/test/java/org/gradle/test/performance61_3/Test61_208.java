package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_208 {
    private final Production61_208 production = new Production61_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}