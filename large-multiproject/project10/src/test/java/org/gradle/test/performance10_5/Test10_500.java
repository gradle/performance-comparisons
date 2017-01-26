package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_500 {
    private final Production10_500 production = new Production10_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}