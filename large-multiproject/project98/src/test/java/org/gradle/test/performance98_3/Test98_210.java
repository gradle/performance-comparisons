package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_210 {
    private final Production98_210 production = new Production98_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}