package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_471 {
    private final Production10_471 production = new Production10_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}