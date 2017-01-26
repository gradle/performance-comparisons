package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_237 {
    private final Production61_237 production = new Production61_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}