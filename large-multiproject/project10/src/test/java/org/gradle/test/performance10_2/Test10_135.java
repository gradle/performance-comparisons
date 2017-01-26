package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_135 {
    private final Production10_135 production = new Production10_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}