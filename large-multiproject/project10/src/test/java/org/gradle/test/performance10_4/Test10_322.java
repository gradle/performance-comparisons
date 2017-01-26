package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_322 {
    private final Production10_322 production = new Production10_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}