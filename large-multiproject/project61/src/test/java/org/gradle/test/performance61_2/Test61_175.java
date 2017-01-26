package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_175 {
    private final Production61_175 production = new Production61_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}