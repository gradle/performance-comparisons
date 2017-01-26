package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_42 {
    private final Production98_42 production = new Production98_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}