package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_31 {
    private final Production61_31 production = new Production61_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}