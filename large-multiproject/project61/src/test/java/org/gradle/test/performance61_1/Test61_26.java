package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_26 {
    private final Production61_26 production = new Production61_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}