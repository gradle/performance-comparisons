package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_125 {
    private final Production61_125 production = new Production61_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}