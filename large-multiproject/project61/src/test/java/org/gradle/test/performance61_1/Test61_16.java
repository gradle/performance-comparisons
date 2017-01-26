package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_16 {
    private final Production61_16 production = new Production61_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}