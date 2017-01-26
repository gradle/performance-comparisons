package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_226 {
    private final Production61_226 production = new Production61_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}