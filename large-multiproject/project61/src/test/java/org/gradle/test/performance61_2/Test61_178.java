package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_178 {
    private final Production61_178 production = new Production61_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}