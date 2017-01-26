package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_354 {
    private final Production10_354 production = new Production10_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}