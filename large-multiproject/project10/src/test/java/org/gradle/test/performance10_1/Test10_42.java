package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_42 {
    private final Production10_42 production = new Production10_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}