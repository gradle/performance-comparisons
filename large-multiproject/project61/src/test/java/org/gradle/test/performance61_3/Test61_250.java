package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_250 {
    private final Production61_250 production = new Production61_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}