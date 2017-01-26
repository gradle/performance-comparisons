package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_4 {
    private final Production10_4 production = new Production10_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}