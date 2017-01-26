package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_121 {
    private final Production10_121 production = new Production10_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}