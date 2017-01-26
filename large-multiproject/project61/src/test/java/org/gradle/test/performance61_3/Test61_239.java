package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_239 {
    private final Production61_239 production = new Production61_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}