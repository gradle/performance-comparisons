package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_130 {
    private final Production61_130 production = new Production61_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}