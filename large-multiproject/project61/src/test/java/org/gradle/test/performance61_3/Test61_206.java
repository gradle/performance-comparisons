package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_206 {
    private final Production61_206 production = new Production61_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}