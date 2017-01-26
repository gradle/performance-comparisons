package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_6 {
    private final Production61_6 production = new Production61_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}