package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_15 {
    private final Production61_15 production = new Production61_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}