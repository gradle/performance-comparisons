package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_47 {
    private final Production10_47 production = new Production10_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}