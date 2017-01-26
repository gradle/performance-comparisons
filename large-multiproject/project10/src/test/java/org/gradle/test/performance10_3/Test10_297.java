package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_297 {
    private final Production10_297 production = new Production10_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}