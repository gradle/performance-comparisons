package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_321 {
    private final Production10_321 production = new Production10_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}