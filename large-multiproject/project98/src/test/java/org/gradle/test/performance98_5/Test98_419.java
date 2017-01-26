package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_419 {
    private final Production98_419 production = new Production98_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}