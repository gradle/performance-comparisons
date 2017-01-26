package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_337 {
    private final Production10_337 production = new Production10_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}