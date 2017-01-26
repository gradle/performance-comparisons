package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_192 {
    private final Production61_192 production = new Production61_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}