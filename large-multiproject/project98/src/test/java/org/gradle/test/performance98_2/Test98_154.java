package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_154 {
    private final Production98_154 production = new Production98_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}