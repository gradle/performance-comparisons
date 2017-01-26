package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_391 {
    private final Production61_391 production = new Production61_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}