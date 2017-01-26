package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_254 {
    private final Production61_254 production = new Production61_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}