package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_139 {
    private final Production98_139 production = new Production98_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}