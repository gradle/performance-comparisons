package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_162 {
    private final Production98_162 production = new Production98_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}