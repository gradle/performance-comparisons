package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_258 {
    private final Production20_258 production = new Production20_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}