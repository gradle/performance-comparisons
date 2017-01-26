package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_254 {
    private final Production10_254 production = new Production10_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}