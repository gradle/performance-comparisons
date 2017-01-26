package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_324 {
    private final Production10_324 production = new Production10_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}