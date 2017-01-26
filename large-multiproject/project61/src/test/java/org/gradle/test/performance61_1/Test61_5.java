package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_5 {
    private final Production61_5 production = new Production61_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}