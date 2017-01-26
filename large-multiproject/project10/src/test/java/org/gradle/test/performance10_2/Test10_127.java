package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_127 {
    private final Production10_127 production = new Production10_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}