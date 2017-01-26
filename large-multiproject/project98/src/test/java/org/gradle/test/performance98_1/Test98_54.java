package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_54 {
    private final Production98_54 production = new Production98_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}