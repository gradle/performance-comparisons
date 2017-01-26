package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_26 {
    private final Production10_26 production = new Production10_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}