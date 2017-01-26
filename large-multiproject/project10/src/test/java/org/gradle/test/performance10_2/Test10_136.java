package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_136 {
    private final Production10_136 production = new Production10_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}