package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_122 {
    private final Production10_122 production = new Production10_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}