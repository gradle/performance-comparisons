package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_143 {
    private final Production10_143 production = new Production10_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}