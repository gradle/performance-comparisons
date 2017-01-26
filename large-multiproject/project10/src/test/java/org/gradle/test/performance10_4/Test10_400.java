package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_400 {
    private final Production10_400 production = new Production10_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}