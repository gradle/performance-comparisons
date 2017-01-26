package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_84 {
    private final Production61_84 production = new Production61_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}