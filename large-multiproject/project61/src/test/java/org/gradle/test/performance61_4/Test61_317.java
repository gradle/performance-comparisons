package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_317 {
    private final Production61_317 production = new Production61_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}