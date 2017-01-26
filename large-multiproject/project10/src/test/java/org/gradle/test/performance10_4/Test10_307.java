package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_307 {
    private final Production10_307 production = new Production10_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}