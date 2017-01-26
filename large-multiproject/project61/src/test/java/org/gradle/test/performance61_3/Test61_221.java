package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_221 {
    private final Production61_221 production = new Production61_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}