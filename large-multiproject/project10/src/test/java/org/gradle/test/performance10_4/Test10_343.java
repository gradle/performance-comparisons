package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_343 {
    private final Production10_343 production = new Production10_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}