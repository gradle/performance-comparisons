package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_192 {
    private final Production10_192 production = new Production10_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}