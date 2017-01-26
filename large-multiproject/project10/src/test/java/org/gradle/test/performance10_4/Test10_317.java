package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_317 {
    private final Production10_317 production = new Production10_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}