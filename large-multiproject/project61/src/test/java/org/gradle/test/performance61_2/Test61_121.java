package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_121 {
    private final Production61_121 production = new Production61_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}