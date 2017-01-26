package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_37 {
    private final Production10_37 production = new Production10_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}