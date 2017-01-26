package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_136 {
    private final Production61_136 production = new Production61_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}