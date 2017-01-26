package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_363 {
    private final Production10_363 production = new Production10_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}