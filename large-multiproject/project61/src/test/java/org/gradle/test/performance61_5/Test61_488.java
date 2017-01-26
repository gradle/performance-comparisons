package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_488 {
    private final Production61_488 production = new Production61_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}