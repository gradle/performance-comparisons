package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_401 {
    private final Production10_401 production = new Production10_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}