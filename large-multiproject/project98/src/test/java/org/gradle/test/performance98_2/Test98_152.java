package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_152 {
    private final Production98_152 production = new Production98_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}