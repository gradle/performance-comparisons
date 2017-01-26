package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_25 {
    private final Production98_25 production = new Production98_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}