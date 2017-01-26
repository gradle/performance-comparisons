package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_295 {
    private final Production61_295 production = new Production61_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}