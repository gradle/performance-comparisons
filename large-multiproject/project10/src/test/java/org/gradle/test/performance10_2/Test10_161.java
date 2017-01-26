package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_161 {
    private final Production10_161 production = new Production10_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}