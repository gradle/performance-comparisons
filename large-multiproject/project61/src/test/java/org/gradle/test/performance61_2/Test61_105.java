package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_105 {
    private final Production61_105 production = new Production61_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}