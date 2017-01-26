package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_243 {
    private final Production61_243 production = new Production61_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}