package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_447 {
    private final Production61_447 production = new Production61_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}