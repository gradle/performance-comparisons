package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_60 {
    private final Production10_60 production = new Production10_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}