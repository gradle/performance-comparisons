package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_260 {
    private final Production10_260 production = new Production10_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}