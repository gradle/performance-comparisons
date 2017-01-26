package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_389 {
    private final Production20_389 production = new Production20_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}