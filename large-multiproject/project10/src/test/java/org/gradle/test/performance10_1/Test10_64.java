package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_64 {
    private final Production10_64 production = new Production10_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}