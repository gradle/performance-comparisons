package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_171 {
    private final Production10_171 production = new Production10_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}