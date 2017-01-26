package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_152 {
    private final Production61_152 production = new Production61_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}