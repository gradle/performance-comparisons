package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_418 {
    private final Production10_418 production = new Production10_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}