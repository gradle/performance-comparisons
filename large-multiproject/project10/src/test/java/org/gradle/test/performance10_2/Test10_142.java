package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_142 {
    private final Production10_142 production = new Production10_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}