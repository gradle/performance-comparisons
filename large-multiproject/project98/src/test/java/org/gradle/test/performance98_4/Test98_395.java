package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_395 {
    private final Production98_395 production = new Production98_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}