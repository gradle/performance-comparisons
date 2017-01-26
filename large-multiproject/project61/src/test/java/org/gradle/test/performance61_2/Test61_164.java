package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_164 {
    private final Production61_164 production = new Production61_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}