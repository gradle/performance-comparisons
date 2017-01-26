package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_188 {
    private final Production98_188 production = new Production98_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}