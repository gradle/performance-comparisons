package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_290 {
    private final Production10_290 production = new Production10_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}