package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_140 {
    private final Production10_140 production = new Production10_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}