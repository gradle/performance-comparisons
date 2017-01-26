package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_287 {
    private final Production20_287 production = new Production20_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}