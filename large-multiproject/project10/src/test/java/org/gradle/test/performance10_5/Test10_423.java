package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_423 {
    private final Production10_423 production = new Production10_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}