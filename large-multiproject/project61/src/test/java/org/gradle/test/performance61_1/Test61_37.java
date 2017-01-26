package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_37 {
    private final Production61_37 production = new Production61_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}