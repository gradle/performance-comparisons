package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_377 {
    private final Production10_377 production = new Production10_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}