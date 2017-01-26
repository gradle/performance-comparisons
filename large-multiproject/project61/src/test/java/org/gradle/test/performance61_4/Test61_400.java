package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_400 {
    private final Production61_400 production = new Production61_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}