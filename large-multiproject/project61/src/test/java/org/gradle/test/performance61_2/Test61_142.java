package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_142 {
    private final Production61_142 production = new Production61_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}