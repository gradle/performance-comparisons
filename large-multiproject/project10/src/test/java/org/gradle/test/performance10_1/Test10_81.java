package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_81 {
    private final Production10_81 production = new Production10_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}