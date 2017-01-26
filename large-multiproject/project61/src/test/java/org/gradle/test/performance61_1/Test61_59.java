package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_59 {
    private final Production61_59 production = new Production61_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}