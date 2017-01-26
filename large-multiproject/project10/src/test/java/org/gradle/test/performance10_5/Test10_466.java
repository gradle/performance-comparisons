package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_466 {
    private final Production10_466 production = new Production10_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}