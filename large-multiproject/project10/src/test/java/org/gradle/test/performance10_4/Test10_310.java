package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_310 {
    private final Production10_310 production = new Production10_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}