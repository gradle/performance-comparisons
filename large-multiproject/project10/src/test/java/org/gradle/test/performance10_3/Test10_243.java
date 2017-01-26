package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_243 {
    private final Production10_243 production = new Production10_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}