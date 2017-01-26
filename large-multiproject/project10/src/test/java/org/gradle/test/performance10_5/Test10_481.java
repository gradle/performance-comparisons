package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_481 {
    private final Production10_481 production = new Production10_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}