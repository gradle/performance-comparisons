package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_419 {
    private final Production10_419 production = new Production10_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}