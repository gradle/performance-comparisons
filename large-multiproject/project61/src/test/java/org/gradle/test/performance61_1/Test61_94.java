package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_94 {
    private final Production61_94 production = new Production61_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}