package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_392 {
    private final Production61_392 production = new Production61_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}