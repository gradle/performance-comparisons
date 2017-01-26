package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_114 {
    private final Production10_114 production = new Production10_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}