package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_341 {
    private final Production10_341 production = new Production10_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}