package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_328 {
    private final Production20_328 production = new Production20_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}