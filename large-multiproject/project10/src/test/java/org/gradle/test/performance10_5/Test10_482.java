package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_482 {
    private final Production10_482 production = new Production10_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}