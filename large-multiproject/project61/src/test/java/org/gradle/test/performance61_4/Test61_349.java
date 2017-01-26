package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_349 {
    private final Production61_349 production = new Production61_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}