package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_113 {
    private final Production61_113 production = new Production61_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}