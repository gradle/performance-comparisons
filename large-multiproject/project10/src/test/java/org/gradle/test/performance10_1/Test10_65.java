package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_65 {
    private final Production10_65 production = new Production10_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}