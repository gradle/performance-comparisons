package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_272 {
    private final Production61_272 production = new Production61_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}