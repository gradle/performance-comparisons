package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_414 {
    private final Production20_414 production = new Production20_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}