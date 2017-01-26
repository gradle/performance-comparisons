package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_13 {
    private final Production61_13 production = new Production61_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}