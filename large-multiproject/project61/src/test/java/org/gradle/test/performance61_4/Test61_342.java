package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_342 {
    private final Production61_342 production = new Production61_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}