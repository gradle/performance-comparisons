package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_492 {
    private final Production10_492 production = new Production10_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}