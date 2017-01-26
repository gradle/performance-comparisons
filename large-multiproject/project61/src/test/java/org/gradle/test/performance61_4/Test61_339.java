package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_339 {
    private final Production61_339 production = new Production61_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}