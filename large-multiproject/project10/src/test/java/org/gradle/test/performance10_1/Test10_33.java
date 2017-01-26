package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_33 {
    private final Production10_33 production = new Production10_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}