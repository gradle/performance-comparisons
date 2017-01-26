package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_139 {
    private final Production61_139 production = new Production61_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}