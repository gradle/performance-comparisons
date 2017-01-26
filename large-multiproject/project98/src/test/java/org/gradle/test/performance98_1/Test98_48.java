package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_48 {
    private final Production98_48 production = new Production98_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}