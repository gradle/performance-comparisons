package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_184 {
    private final Production61_184 production = new Production61_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}