package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_149 {
    private final Production10_149 production = new Production10_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}