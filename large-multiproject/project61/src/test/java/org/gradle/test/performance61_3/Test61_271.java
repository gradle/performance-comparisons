package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_271 {
    private final Production61_271 production = new Production61_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}