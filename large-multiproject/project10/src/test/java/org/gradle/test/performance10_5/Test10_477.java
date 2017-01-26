package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_477 {
    private final Production10_477 production = new Production10_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}