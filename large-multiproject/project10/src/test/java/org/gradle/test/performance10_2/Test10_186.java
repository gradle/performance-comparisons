package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_186 {
    private final Production10_186 production = new Production10_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}