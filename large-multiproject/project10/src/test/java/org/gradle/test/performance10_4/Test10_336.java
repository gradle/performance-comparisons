package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_336 {
    private final Production10_336 production = new Production10_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}