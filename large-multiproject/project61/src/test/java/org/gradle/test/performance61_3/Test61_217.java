package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_217 {
    private final Production61_217 production = new Production61_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}