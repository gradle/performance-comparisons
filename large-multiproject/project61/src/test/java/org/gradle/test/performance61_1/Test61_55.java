package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_55 {
    private final Production61_55 production = new Production61_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}