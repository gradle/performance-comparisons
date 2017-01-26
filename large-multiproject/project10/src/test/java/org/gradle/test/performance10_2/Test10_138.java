package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_138 {
    private final Production10_138 production = new Production10_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}