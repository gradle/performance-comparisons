package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_37 {
    private final Production98_37 production = new Production98_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}