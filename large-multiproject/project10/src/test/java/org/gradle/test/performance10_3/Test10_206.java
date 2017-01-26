package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_206 {
    private final Production10_206 production = new Production10_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}