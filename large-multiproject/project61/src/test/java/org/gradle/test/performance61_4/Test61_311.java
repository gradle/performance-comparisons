package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_311 {
    private final Production61_311 production = new Production61_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}