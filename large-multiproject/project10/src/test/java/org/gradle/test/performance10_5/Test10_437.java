package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_437 {
    private final Production10_437 production = new Production10_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}