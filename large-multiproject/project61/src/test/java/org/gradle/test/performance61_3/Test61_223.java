package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_223 {
    private final Production61_223 production = new Production61_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}