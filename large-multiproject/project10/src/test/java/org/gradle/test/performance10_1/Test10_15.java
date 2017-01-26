package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_15 {
    private final Production10_15 production = new Production10_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}