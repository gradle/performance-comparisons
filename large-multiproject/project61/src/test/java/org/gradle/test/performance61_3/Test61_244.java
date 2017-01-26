package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_244 {
    private final Production61_244 production = new Production61_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}