package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_46 {
    private final Production61_46 production = new Production61_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}