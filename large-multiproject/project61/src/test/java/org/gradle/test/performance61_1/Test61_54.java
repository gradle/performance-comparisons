package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_54 {
    private final Production61_54 production = new Production61_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}