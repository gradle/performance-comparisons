package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_261 {
    private final Production10_261 production = new Production10_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}