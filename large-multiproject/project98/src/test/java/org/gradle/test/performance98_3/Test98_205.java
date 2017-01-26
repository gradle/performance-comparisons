package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_205 {
    private final Production98_205 production = new Production98_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}