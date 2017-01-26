package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_87 {
    private final Production10_87 production = new Production10_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}