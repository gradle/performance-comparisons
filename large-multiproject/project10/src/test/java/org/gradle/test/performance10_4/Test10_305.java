package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_305 {
    private final Production10_305 production = new Production10_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}