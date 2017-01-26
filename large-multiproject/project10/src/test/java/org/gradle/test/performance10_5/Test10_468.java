package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_468 {
    private final Production10_468 production = new Production10_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}