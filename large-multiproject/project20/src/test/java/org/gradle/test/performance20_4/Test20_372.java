package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_372 {
    private final Production20_372 production = new Production20_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}