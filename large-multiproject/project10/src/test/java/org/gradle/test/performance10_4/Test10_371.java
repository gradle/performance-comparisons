package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_371 {
    private final Production10_371 production = new Production10_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}