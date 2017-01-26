package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_370 {
    private final Production61_370 production = new Production61_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}