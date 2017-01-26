package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_486 {
    private final Production10_486 production = new Production10_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}