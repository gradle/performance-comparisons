package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_222 {
    private final Production10_222 production = new Production10_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}