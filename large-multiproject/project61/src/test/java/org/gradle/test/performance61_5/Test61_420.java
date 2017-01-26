package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_420 {
    private final Production61_420 production = new Production61_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}