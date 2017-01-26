package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_53 {
    private final Production10_53 production = new Production10_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}