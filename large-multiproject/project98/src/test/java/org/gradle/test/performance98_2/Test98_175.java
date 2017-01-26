package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_175 {
    private final Production98_175 production = new Production98_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}