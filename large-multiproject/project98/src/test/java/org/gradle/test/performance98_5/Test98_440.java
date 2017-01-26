package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_440 {
    private final Production98_440 production = new Production98_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}