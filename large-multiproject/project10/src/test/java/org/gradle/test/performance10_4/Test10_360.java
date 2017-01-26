package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_360 {
    private final Production10_360 production = new Production10_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}