package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_479 {
    private final Production10_479 production = new Production10_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}