package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_469 {
    private final Production10_469 production = new Production10_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}