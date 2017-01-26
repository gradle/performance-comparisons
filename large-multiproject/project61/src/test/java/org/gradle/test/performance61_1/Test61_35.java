package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_35 {
    private final Production61_35 production = new Production61_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}