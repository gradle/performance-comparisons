package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_371 {
    private final Production61_371 production = new Production61_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}