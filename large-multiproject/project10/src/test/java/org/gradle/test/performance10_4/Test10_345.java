package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_345 {
    private final Production10_345 production = new Production10_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}