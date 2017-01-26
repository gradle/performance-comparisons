package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_407 {
    private final Production61_407 production = new Production61_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}