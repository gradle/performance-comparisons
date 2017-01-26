package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_170 {
    private final Production61_170 production = new Production61_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}