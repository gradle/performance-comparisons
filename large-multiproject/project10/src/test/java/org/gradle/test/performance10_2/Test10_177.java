package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_177 {
    private final Production10_177 production = new Production10_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}