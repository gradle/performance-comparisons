package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_322 {
    private final Production98_322 production = new Production98_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}