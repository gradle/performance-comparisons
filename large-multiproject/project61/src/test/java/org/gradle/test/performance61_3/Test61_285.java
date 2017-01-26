package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_285 {
    private final Production61_285 production = new Production61_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}