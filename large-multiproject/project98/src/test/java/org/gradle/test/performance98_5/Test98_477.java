package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_477 {
    private final Production98_477 production = new Production98_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}