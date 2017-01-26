package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_499 {
    private final Production61_499 production = new Production61_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}