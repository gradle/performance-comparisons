package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_146 {
    private final Production10_146 production = new Production10_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}