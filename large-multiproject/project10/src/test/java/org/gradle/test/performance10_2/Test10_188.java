package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_188 {
    private final Production10_188 production = new Production10_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}