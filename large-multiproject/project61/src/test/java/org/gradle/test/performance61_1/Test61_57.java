package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_57 {
    private final Production61_57 production = new Production61_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}