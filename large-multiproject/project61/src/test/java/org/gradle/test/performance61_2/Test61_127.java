package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_127 {
    private final Production61_127 production = new Production61_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}