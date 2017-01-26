package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_19 {
    private final Production61_19 production = new Production61_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}