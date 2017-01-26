package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_51 {
    private final Production61_51 production = new Production61_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}