package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_52 {
    private final Production61_52 production = new Production61_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}