package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_156 {
    private final Production98_156 production = new Production98_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}