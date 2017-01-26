package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_287 {
    private final Production61_287 production = new Production61_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}