package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_170 {
    private final Production10_170 production = new Production10_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}