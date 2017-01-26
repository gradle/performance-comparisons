package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_457 {
    private final Production98_457 production = new Production98_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}