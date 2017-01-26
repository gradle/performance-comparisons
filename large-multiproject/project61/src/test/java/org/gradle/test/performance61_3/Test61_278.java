package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_278 {
    private final Production61_278 production = new Production61_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}