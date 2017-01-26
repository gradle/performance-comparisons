package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_18 {
    private final Production61_18 production = new Production61_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}