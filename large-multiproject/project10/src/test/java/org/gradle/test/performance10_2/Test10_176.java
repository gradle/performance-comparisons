package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_176 {
    private final Production10_176 production = new Production10_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}