package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_99 {
    private final Production10_99 production = new Production10_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}