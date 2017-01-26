package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_210 {
    private final Production10_210 production = new Production10_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}