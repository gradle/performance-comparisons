package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_247 {
    private final Production61_247 production = new Production61_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}