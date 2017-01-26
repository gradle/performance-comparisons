package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_108 {
    private final Production61_108 production = new Production61_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}