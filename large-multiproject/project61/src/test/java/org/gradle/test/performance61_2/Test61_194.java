package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_194 {
    private final Production61_194 production = new Production61_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}