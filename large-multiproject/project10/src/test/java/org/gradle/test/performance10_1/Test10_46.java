package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_46 {
    private final Production10_46 production = new Production10_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}