package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_220 {
    private final Production10_220 production = new Production10_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}