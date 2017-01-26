package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_83 {
    private final Production61_83 production = new Production61_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}