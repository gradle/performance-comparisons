package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_379 {
    private final Production10_379 production = new Production10_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}