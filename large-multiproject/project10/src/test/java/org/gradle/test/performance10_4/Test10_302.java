package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_302 {
    private final Production10_302 production = new Production10_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}