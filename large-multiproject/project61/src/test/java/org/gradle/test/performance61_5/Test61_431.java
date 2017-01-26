package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_431 {
    private final Production61_431 production = new Production61_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}