package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_312 {
    private final Production61_312 production = new Production61_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}