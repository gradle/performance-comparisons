package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_203 {
    private final Production10_203 production = new Production10_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}