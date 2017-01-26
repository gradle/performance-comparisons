package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_28 {
    private final Production10_28 production = new Production10_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}