package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_125 {
    private final Production10_125 production = new Production10_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}