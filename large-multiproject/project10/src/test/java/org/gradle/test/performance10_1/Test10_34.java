package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_34 {
    private final Production10_34 production = new Production10_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}