package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_351 {
    private final Production61_351 production = new Production61_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}