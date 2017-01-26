package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_56 {
    private final Production10_56 production = new Production10_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}