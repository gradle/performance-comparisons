package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_158 {
    private final Production61_158 production = new Production61_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}