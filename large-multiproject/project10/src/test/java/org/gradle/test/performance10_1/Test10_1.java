package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_1 {
    private final Production10_1 production = new Production10_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}