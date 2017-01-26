package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_146 {
    private final Production61_146 production = new Production61_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}