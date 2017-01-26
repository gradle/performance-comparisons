package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_213 {
    private final Production10_213 production = new Production10_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}