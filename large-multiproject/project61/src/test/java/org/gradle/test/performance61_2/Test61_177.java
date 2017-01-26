package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_177 {
    private final Production61_177 production = new Production61_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}