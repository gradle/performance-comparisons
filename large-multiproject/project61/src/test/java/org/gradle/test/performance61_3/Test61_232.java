package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_232 {
    private final Production61_232 production = new Production61_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}