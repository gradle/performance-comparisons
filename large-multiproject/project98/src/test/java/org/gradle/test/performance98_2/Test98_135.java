package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_135 {
    private final Production98_135 production = new Production98_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}