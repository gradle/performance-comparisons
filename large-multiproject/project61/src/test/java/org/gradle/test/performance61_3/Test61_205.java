package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_205 {
    private final Production61_205 production = new Production61_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}