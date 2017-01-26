package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_304 {
    private final Production61_304 production = new Production61_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}