package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_247 {
    private final Production10_247 production = new Production10_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}