package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_446 {
    private final Production10_446 production = new Production10_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}