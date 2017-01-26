package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_462 {
    private final Production61_462 production = new Production61_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}