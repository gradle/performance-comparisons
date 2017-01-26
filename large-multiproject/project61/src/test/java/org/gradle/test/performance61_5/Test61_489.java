package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_489 {
    private final Production61_489 production = new Production61_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}