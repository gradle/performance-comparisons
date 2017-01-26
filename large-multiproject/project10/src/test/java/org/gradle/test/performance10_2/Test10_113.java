package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_113 {
    private final Production10_113 production = new Production10_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}