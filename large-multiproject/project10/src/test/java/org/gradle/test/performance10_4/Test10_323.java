package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_323 {
    private final Production10_323 production = new Production10_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}