package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_384 {
    private final Production61_384 production = new Production61_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}