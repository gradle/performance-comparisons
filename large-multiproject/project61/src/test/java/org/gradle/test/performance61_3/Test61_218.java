package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_218 {
    private final Production61_218 production = new Production61_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}