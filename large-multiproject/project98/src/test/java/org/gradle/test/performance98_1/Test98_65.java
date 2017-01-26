package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_65 {
    private final Production98_65 production = new Production98_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}