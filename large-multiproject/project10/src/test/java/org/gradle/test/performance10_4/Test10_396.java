package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_396 {
    private final Production10_396 production = new Production10_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}