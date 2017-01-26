package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_8 {
    private final Production10_8 production = new Production10_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}