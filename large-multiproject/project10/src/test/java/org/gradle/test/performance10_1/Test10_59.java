package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_59 {
    private final Production10_59 production = new Production10_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}