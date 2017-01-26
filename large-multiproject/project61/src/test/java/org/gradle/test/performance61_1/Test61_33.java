package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_33 {
    private final Production61_33 production = new Production61_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}