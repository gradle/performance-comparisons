package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_452 {
    private final Production61_452 production = new Production61_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}