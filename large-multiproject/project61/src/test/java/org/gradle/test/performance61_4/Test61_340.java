package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_340 {
    private final Production61_340 production = new Production61_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}