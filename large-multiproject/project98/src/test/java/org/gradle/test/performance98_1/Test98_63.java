package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_63 {
    private final Production98_63 production = new Production98_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}