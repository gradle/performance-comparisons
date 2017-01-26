package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_371 {
    private final Production98_371 production = new Production98_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}