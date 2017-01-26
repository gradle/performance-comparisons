package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_19 {
    private final Production10_19 production = new Production10_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}