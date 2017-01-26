package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_488 {
    private final Production10_488 production = new Production10_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}