package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_56 {
    private final Production61_56 production = new Production61_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}