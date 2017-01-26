package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_133 {
    private final Production10_133 production = new Production10_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}