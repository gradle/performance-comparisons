package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_116 {
    private final Production61_116 production = new Production61_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}