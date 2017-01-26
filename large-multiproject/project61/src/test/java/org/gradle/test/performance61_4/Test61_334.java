package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_334 {
    private final Production61_334 production = new Production61_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}