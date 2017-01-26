package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_160 {
    private final Production10_160 production = new Production10_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}