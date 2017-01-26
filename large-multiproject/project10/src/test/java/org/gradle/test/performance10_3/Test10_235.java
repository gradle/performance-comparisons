package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_235 {
    private final Production10_235 production = new Production10_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}