package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_313 {
    private final Production10_313 production = new Production10_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}