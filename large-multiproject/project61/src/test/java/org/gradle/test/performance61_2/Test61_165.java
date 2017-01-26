package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_165 {
    private final Production61_165 production = new Production61_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}