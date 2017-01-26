package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_221 {
    private final Production10_221 production = new Production10_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}