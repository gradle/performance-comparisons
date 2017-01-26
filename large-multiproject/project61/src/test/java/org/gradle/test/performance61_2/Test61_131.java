package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_131 {
    private final Production61_131 production = new Production61_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}