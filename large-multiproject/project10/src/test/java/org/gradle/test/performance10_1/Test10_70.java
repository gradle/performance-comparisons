package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_70 {
    private final Production10_70 production = new Production10_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}