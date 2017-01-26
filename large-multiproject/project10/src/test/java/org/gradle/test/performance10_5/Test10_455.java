package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_455 {
    private final Production10_455 production = new Production10_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}