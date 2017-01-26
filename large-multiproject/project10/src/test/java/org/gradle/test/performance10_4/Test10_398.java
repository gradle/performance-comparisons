package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_398 {
    private final Production10_398 production = new Production10_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}