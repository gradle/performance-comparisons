package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_59 {
    private final Production98_59 production = new Production98_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}