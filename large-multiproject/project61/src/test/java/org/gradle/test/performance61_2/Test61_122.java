package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_122 {
    private final Production61_122 production = new Production61_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}