package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_283 {
    private final Production10_283 production = new Production10_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}