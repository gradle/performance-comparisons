package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_26 {
    private final Production98_26 production = new Production98_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}