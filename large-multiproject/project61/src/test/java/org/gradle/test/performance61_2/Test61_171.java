package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_171 {
    private final Production61_171 production = new Production61_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}