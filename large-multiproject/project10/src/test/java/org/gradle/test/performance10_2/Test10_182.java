package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_182 {
    private final Production10_182 production = new Production10_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}