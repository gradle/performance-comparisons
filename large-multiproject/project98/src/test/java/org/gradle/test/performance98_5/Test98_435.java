package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_435 {
    private final Production98_435 production = new Production98_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}