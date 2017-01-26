package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_54 {
    private final Production10_54 production = new Production10_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}