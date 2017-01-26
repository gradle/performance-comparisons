package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_450 {
    private final Production10_450 production = new Production10_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}