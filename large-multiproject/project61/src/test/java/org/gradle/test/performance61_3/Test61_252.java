package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_252 {
    private final Production61_252 production = new Production61_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}