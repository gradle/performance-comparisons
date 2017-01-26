package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_156 {
    private final Production10_156 production = new Production10_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}