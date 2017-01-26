package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_291 {
    private final Production61_291 production = new Production61_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}