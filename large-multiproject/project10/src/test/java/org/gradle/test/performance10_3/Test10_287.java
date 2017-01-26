package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_287 {
    private final Production10_287 production = new Production10_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}