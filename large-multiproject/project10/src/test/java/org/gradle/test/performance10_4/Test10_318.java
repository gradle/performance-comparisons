package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_318 {
    private final Production10_318 production = new Production10_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}