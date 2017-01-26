package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_69 {
    private final Production10_69 production = new Production10_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}