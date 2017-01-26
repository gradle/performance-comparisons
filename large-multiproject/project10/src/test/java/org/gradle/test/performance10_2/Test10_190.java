package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_190 {
    private final Production10_190 production = new Production10_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}