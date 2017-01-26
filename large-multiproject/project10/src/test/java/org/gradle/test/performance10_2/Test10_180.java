package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_180 {
    private final Production10_180 production = new Production10_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}