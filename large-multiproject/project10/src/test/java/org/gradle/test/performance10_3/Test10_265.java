package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_265 {
    private final Production10_265 production = new Production10_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}