package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_231 {
    private final Production98_231 production = new Production98_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}