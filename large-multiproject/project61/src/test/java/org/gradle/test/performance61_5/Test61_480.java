package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_480 {
    private final Production61_480 production = new Production61_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}