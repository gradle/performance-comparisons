package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_4 {
    private final Production61_4 production = new Production61_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}