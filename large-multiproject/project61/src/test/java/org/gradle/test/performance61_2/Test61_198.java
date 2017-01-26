package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_198 {
    private final Production61_198 production = new Production61_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}