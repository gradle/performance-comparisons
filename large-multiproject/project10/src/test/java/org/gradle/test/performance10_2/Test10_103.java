package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_103 {
    private final Production10_103 production = new Production10_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}