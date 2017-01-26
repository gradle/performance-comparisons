package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_84 {
    private final Production10_84 production = new Production10_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}