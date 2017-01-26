package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_396 {
    private final Production61_396 production = new Production61_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}