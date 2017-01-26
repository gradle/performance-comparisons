package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_31 {
    private final Production10_31 production = new Production10_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}