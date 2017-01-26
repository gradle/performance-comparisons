package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_298 {
    private final Production61_298 production = new Production61_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}