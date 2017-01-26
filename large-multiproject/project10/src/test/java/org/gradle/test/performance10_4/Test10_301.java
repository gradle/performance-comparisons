package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_301 {
    private final Production10_301 production = new Production10_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}