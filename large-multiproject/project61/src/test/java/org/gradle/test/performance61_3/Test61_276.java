package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_276 {
    private final Production61_276 production = new Production61_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}