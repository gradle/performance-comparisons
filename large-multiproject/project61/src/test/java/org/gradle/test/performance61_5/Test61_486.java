package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_486 {
    private final Production61_486 production = new Production61_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}