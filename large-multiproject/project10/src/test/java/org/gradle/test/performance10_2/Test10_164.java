package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_164 {
    private final Production10_164 production = new Production10_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}