package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_87 {
    private final Production61_87 production = new Production61_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}