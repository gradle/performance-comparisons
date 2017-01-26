package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_348 {
    private final Production61_348 production = new Production61_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}