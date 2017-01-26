package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_367 {
    private final Production10_367 production = new Production10_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}