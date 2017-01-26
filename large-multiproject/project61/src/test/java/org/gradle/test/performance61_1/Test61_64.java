package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_64 {
    private final Production61_64 production = new Production61_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}