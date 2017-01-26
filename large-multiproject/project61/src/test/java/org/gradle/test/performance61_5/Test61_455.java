package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_455 {
    private final Production61_455 production = new Production61_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}