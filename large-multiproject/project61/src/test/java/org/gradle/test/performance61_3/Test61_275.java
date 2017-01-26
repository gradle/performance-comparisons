package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_275 {
    private final Production61_275 production = new Production61_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}