package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_244 {
    private final Production10_244 production = new Production10_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}