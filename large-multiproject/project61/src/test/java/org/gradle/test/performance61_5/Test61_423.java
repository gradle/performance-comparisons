package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_423 {
    private final Production61_423 production = new Production61_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}