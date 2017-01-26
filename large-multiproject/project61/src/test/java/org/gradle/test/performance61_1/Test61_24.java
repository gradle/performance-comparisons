package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_24 {
    private final Production61_24 production = new Production61_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}