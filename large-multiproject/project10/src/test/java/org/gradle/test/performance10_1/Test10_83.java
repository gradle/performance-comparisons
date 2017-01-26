package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_83 {
    private final Production10_83 production = new Production10_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}