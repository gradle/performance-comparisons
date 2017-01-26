package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_5 {
    private final Production10_5 production = new Production10_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}