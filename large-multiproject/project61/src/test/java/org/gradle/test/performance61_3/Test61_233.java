package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_233 {
    private final Production61_233 production = new Production61_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}