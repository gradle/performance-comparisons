package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_242 {
    private final Production10_242 production = new Production10_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}