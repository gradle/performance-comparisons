package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_18 {
    private final Production10_18 production = new Production10_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}