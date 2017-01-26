package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_165 {
    private final Production10_165 production = new Production10_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}