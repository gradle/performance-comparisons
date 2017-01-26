package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_306 {
    private final Production10_306 production = new Production10_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}