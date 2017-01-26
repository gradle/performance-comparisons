package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_69 {
    private final Production61_69 production = new Production61_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}