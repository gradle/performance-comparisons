package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_379 {
    private final Production61_379 production = new Production61_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}