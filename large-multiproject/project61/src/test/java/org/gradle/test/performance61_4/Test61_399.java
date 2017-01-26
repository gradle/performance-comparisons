package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_399 {
    private final Production61_399 production = new Production61_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}