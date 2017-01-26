package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_485 {
    private final Production61_485 production = new Production61_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}