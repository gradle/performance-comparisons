package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_158 {
    private final Production10_158 production = new Production10_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}