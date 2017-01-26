package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_443 {
    private final Production61_443 production = new Production61_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}