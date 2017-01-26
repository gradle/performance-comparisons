package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_249 {
    private final Production61_249 production = new Production61_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}