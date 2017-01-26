package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_98 {
    private final Production10_98 production = new Production10_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}