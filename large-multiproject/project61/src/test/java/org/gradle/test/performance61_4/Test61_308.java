package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_308 {
    private final Production61_308 production = new Production61_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}