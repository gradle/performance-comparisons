package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_365 {
    private final Production10_365 production = new Production10_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}