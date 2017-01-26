package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_339 {
    private final Production10_339 production = new Production10_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}