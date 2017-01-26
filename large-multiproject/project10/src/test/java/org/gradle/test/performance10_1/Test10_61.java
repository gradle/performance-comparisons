package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_61 {
    private final Production10_61 production = new Production10_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}