package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_291 {
    private final Production10_291 production = new Production10_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}