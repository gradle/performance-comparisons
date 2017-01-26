package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_357 {
    private final Production10_357 production = new Production10_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}