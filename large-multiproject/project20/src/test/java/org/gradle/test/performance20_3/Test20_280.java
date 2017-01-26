package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_280 {
    private final Production20_280 production = new Production20_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}