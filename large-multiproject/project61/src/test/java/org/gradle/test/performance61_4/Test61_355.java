package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_355 {
    private final Production61_355 production = new Production61_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}